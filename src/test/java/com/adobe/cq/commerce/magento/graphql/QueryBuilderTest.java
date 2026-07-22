/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
 *    This file is licensed to you under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License. You may obtain a copy
 *    of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software distributed under
 *    the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 *    OF ANY KIND, either express or implied. See the License for the specific language
 *    governing permissions and limitations under the License.
 *
 ******************************************************************************/

package com.adobe.cq.commerce.magento.graphql;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import com.adobe.cq.commerce.magento.graphql.QueryQuery.CategoryArgumentsDefinition;
import com.adobe.cq.commerce.magento.graphql.QueryQuery.ProductsArgumentsDefinition;
import com.adobe.cq.commerce.magento.graphql.gson.MutationDeserializer;
import com.adobe.cq.commerce.magento.graphql.gson.QueryDeserializer;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Fragment;
import com.shopify.graphql.support.SchemaViolationError;

public class QueryBuilderTest {

    private String getResource(String filename) throws IOException {
        return IOUtils.toString(QueryBuilderTest.class.getClassLoader().getResourceAsStream(filename), StandardCharsets.UTF_8);
    }

    @Test
    public void testProductQuery() throws IOException {
        String expectedQuery = getResource("queries/product-by-sku.txt");
        String jsonResponse = getResource("responses/product-by-sku.json");

        // Search parameters
        FilterEqualTypeInput input = new FilterEqualTypeInput().setEq("whatever");
        ProductAttributeFilterInput filter = new ProductAttributeFilterInput().setSku(input);
        ProductsArgumentsDefinition searchArgs = s -> s.filter(filter);

        // Main query
        ProductsQueryDefinition queryArgs = q -> q.items(TestGraphqlQueries.CONFIGURABLE_PRODUCT_QUERY);

        // Check that the generated query matches the reference query
        String queryString = Operations.query(query -> query.products(searchArgs, queryArgs)).toString();
        Assert.assertEquals(expectedQuery, queryString);

        // Check that the reference response can be parsed and fields are properly set
        Query query = QueryDeserializer.getGson().fromJson(jsonResponse, Query.class);
        ProductInterface product = query.getProducts().getItems().get(0);

        Assert.assertEquals("uid1", product.getUid().toString());
        Assert.assertEquals("testSimpleProduct", product.getSku());
        Assert.assertEquals("Test Simple Product", product.getName());
        Assert.assertEquals("test-category", product.getCategories().get(0).getUrlPath());
        Assert.assertEquals(CurrencyEnum.USD, product.getPrice().getRegularPrice().getAmount().getCurrency());
        Assert.assertEquals(22.2, product.getPrice().getRegularPrice().getAmount().getValue(), 0);

        // Test that primitives returned a strings get converted to primitive types
        Assert.assertEquals(Integer.valueOf(1), product.getColor());
        Assert.assertEquals(1.2, product.getSpecialPrice(), 0);
        Assert.assertEquals(Boolean.TRUE, product.getMediaGalleryEntries().get(0).getDisabled());
        Assert.assertEquals(Boolean.TRUE, product.getMediaGalleryEntries().get(1).getDisabled());
    }

    @Test
    public void testSearchProducts() throws Exception {
        String expectedQuery = getResource("queries/products-search.txt");

        // Search parameters
        ProductsArgumentsDefinition searchArgs = s -> s.search("whatever").currentPage(0).pageSize(3);

        // Main query
        ProductsQueryDefinition queryArgs = q -> q.items(TestGraphqlQueries.CONFIGURABLE_PRODUCT_QUERY);

        String queryString = Operations.query(query -> query.products(searchArgs, queryArgs)).toString();
        Assert.assertEquals(expectedQuery, queryString);
    }

    @Test
    public void testCategoryTree() throws Exception {
        String expectedQuery = getResource("queries/root-category.txt");
        String jsonResponse = getResource("responses/root-category.json");

        // Search parameters
        CategoryArgumentsDefinition searchArgs = q -> q.id(4);

        // Create "recursive" query with depth 5 to fetch category data and children
        // There isn't any better way to build such a query with GraphQL
        CategoryTreeQueryDefinition queryArgs = q -> TestGraphqlQueries.CATEGORY_TREE_LAMBDA
            .apply(q)
            .children(r -> TestGraphqlQueries.CATEGORY_TREE_LAMBDA
                .apply(r)
                .children(s -> TestGraphqlQueries.CATEGORY_TREE_LAMBDA
                    .apply(s)
                    .children(t -> TestGraphqlQueries.CATEGORY_TREE_LAMBDA
                        .apply(t)
                        .children(u -> TestGraphqlQueries.CATEGORY_TREE_LAMBDA
                            .apply(u)))));

        // Check that the generated query matches the reference query
        String queryString = Operations.query(query -> query.category(searchArgs, queryArgs)).toString();
        Assert.assertEquals(expectedQuery, queryString);

        // Check that the reference response can be parsed and fields are properly set
        Query query = QueryDeserializer.getGson().fromJson(jsonResponse, Query.class);
        CategoryTree categoryTree = query.getCategory();

        Assert.assertEquals(2, categoryTree.getId().intValue());
        Assert.assertEquals("Default Category", categoryTree.getName());
        Assert.assertEquals(1, categoryTree.getChildren().size());
    }

    @Test(expected = SchemaViolationError.class)
    public void testSchemaViolationError() throws Exception {
        String jsonResponse = getResource("responses/root-category-with-unknown-field.json");

        // Triggers a SchemaViolationError
        // (we don't use QueryDeserializer.getGson().fromJson() because it would trigger a JsonParseException)
        new Query(new JsonParser().parse(jsonResponse).getAsJsonObject());
    }

    @Test
    public void testCategoryTreeProducts() throws Exception {
        String expectedQuery = getResource("queries/category-products.txt");

        // Search parameters
        CategoryArgumentsDefinition searchArgs = q -> q.id(19);

        // Main query
        CategoryTreeQueryDefinition queryArgs = q -> q
            .products(p -> p
                .items(TestGraphqlQueries.CONFIGURABLE_PRODUCT_QUERY));

        String queryString = Operations.query(query -> query.category(searchArgs, queryArgs)).toString();
        Assert.assertEquals(expectedQuery, queryString);
    }

    @Test
    public void testCategoriesWithAliases() throws Exception {
        String expectedQuery = getResource("queries/categories-with-aliases.txt");
        String jsonResponse = getResource("responses/categories-with-aliases.json");

        // Query for each category
        CategoryTreeQueryDefinition queryArgs = q -> q
            .id()
            .name()
            .urlPath();

        // Main query for two categories with aliases
        String queryString = Operations.query(query -> query
            .withAlias("category3").category(c -> c.id(3), queryArgs)
            .withAlias("category4").category(c -> c.id(4), queryArgs)).toString();

        // Check that the generated query matches the reference query
        Assert.assertEquals(expectedQuery, queryString);

        // Check that the reference response can be parsed and fields are properly set
        Query query = QueryDeserializer.getGson().fromJson(jsonResponse, Query.class);

        // An aliased field is queried by the original fieldname + "__" + the alias
        CategoryTree category3 = (CategoryTree) query.get("category" + AbstractQuery.ALIAS_SUFFIX_SEPARATOR + "category3");
        Assert.assertEquals(Integer.valueOf(3), category3.getId());
        Assert.assertEquals("Equipment", category3.getName());
        Assert.assertEquals("equipment", category3.getUrlPath());

        // An aliased field is queried by the original fieldname + "__" + the alias
        CategoryTree category4 = (CategoryTree) query.get("category" + AbstractQuery.ALIAS_SUFFIX_SEPARATOR + "category4");
        Assert.assertEquals(Integer.valueOf(4), category4.getId());
        Assert.assertEquals("Running", category4.getName());
        Assert.assertEquals("equipment/running", category4.getUrlPath());
    }

    @Test
    public void testMutationRequest() throws Exception {
        String expectedQuery = getResource("queries/create-customer.txt");
        String jsonResponse = getResource("responses/create-customer.json");

        CustomerInput customerInput = new CustomerInput()
            .setEmail("john.doe@example.com")
            .setFirstname("John")
            .setLastname("Doe")
            .setPassword("*****");

        CustomerOutputQueryDefinition customerQuery = c -> c.customer(TestGraphqlQueries.CUSTOMER_QUERY);
        String mutationString = Operations.mutation(mutation -> mutation.createCustomer(customerInput, customerQuery)).toString();

        // Check that the generated query matches the reference query
        Assert.assertEquals(expectedQuery, mutationString);

        // Check that the reference response can be parsed and fields are properly set
        Mutation mutation = MutationDeserializer.getGson().fromJson(jsonResponse, Mutation.class);

        Customer customer = mutation.getCreateCustomer().getCustomer();
        Assert.assertEquals("john.doe@example.com", customer.getEmail());
        Assert.assertEquals("John", customer.getFirstname());
        Assert.assertEquals("Doe", customer.getLastname());
    }

    @Test
    public void testCustomFieldTypes() throws Exception {
        String expectedQuery = getResource("queries/category-with-custom-field.txt");
        String jsonResponse = getResource("responses/category-with-custom-field.json");

        // Category with custom fields of different primitve types
        CategoryTreeQueryDefinition queryArgs = q -> q
            .id()
            .name()
            .addCustomSimpleField("mystring")
            .addCustomSimpleField("myinteger")
            .addCustomSimpleField("mydouble")
            .addCustomSimpleField("myboolean")
            .addCustomSimpleField("myarray");

        // Search parameters
        CategoryArgumentsDefinition searchArgs = q -> q.id(3);

        String queryString = Operations.query(query -> query.category(searchArgs, queryArgs)).toString();

        // Check that the generated query matches the reference query
        Assert.assertEquals(expectedQuery, queryString);

        // Check that the reference response can be parsed and fields are properly set
        Query query = QueryDeserializer.getGson().fromJson(jsonResponse, Query.class);
        CategoryTree category = query.getCategory();

        // Check that custom fields of different types can be parsed
        Assert.assertEquals("somevalue", category.getAsString("mystring"));
        Assert.assertEquals(Integer.valueOf(42), category.getAsInteger("myinteger"));
        Assert.assertEquals(4.2, category.getAsDouble("mydouble"), 0);
        Assert.assertEquals(Boolean.TRUE, category.getAsBoolean("myboolean"));
        Assert.assertTrue(category.getAsArray("myarray") instanceof JsonArray);
    }

    @Test
    public void testCustomFieldsAndObjects() throws Exception {
        String expectedQuery = getResource("queries/product-with-custom-fields.txt");
        String jsonResponse = getResource("responses/product-with-custom-fields.json");

        // Search parameters
        ProductsArgumentsDefinition searchArgs = s -> s.search("short").currentPage(1);

        // Product query with custom objects fields
        ProductsQueryDefinition queryArgs = q -> q.items(i -> i
            .sku()
            .addCustomSimpleField("erin_recommends")
            .addCustomSimpleField("climate")
            .addCustomObjectField("replacement_product", c -> c
                .addField("__typename")
                .addField("sku")
                .addField("name")
                .addCustomSimpleField("weight"))
            .addCustomObjectField("crosssell_products", c -> c
                .addField("__typename")
                .addField("sku")
                .addField("name")));

        String queryString = Operations.query(query -> query.products(searchArgs, queryArgs)).toString();

        // Check that the generated query matches the reference query
        Assert.assertEquals(expectedQuery, queryString);

        // Check that the reference response can be parsed and fields are properly set
        Query query = QueryDeserializer.getGson().fromJson(jsonResponse, Query.class);
        ConfigurableProduct product = (ConfigurableProduct) query.getProducts().getItems().get(0);

        // Check the "simple" custom fields
        Assert.assertEquals("MSH12", product.getSku());
        Assert.assertEquals(Integer.valueOf(0), product.getAsInteger("erin_recommends"));
        Assert.assertEquals("205,212,209", product.getAsString("climate"));

        // Check array custom field with objects element
        JsonArray crossSellProducts = product.getAsArray("crosssell_products");
        ProductInterface crossSellProduct = UnknownProductInterface.create(crossSellProducts.get(0).getAsJsonObject());
        Assert.assertEquals("SimpleProduct", crossSellProduct.get("__typename"));
        Assert.assertEquals("24-UG06", crossSellProduct.getSku());
        Assert.assertEquals("Affirm Water Bottle", crossSellProduct.getName());

        // Check custom object field
        JsonElement replacementProductElement = (JsonElement) product.get("replacement_product");
        ProductInterface replacementProduct = UnknownProductInterface.create(replacementProductElement.getAsJsonObject());
        Assert.assertEquals("ConfigurableProduct", replacementProduct.get("__typename"));
        Assert.assertEquals("MSH12-old", replacementProduct.getSku());
        Assert.assertEquals("Zing Jump Rope", replacementProduct.getName());
        Assert.assertEquals(Integer.valueOf(42), replacementProduct.getAsInteger("weight"));
    }

    @Test
    public void testSchemaIntrospection() throws IOException {
        String expectedQuery = getResource("queries/schema-introspection.txt");

        // This is the real response of the query on Magento EE 2.3.5-develop
        String jsonResponse = getResource("responses/schema-introspection.json");

        __SchemaQueryDefinition schemaQuery = q -> q
            .types(t -> t
                .name()
                .fields(f -> f
                    .name()
                    .description()));

        // Check that the generated query matches the reference query
        String queryString = Operations.query(query -> query.__schema(schemaQuery)).toString();
        Assert.assertEquals(expectedQuery, queryString);

        // Check that the reference response can be parsed and fields are properly set
        Query query = QueryDeserializer.getGson().fromJson(jsonResponse, Query.class);
        __Schema schema = query.__getSchema();
        Assert.assertEquals(278, schema.getTypes().size());
    }

    @Test
    public void testTypeIntrospection() throws IOException {
        String expectedQuery = getResource("queries/type-introspection.txt");

        // This is the real response of the query on Magento EE 2.3.5-develop with LUMA sample data
        String jsonResponse = getResource("responses/type-introspection.json");

        __TypeQueryDefinition typeQuery = q -> q
            .name()
            .description()
            .inputFields(i -> i
                .name()
                .type(t -> t
                    .name()));

        // Check that the generated query matches the reference query
        String queryString = Operations.query(query -> query.__type("ProductAttributeFilterInput", typeQuery)).toString();
        Assert.assertEquals(expectedQuery, queryString);

        // Check that the reference response can be parsed and fields are properly set
        Query query = QueryDeserializer.getGson().fromJson(jsonResponse, Query.class);
        __Type type = query.__getType();
        Assert.assertEquals("ProductAttributeFilterInput", type.getName());
        Assert.assertEquals(29, type.getInputFields().size());
    }

    @Test
    public void testFullIntrospectionResponse() throws IOException {
        // This is the real intropection response from Magento CE 2.3.4
        String jsonResponse = getResource("responses/magento-schema-2.3.4.min.json");

        // Check that the reference response can be parsed and fields are properly set
        Query query = QueryDeserializer.getGson().fromJson(jsonResponse, Query.class);
        __Schema schema = query.__getSchema();
        Assert.assertEquals(256, schema.getTypes().size());
        Assert.assertEquals(3, schema.getDirectives().size());
    }

    @Test
    public void testQueryWithFragments() throws IOException {
        String expectedQuery = getResource("queries/product-query-with-fragments.txt");

        // This tests the same query than the CIF Product component version 1.2.0
        // but it uses "names" fragments to generate the query.

        // Search parameters
        FilterEqualTypeInput input = new FilterEqualTypeInput().setEq("chaz-kangeroo-hoodie");
        ProductAttributeFilterInput filter = new ProductAttributeFilterInput().setUrlKey(input);
        ProductsArgumentsDefinition searchArgs = s -> s.filter(filter);

        // Fragment
        Fragment<ProductInterfaceQuery> simpleProductFragment = ProductInterfaceQuery.createFragment("simpleProduct", q -> q
            .sku()
            .name()
            .description(d -> d.html())
            .image(i -> i.label().url())
            .thumbnail(t -> t.label().url())
            .urlKey()
            .stockStatus());

        Fragment<ProductPriceQuery> priceFragment = ProductPriceQuery.createFragment("price", p -> p
            .regularPrice(r -> r
                .value()
                .currency())
            .finalPrice(f -> f
                .value()
                .currency())
            .discount(d -> d
                .amountOff()
                .percentOff()));

        Fragment<ProductInterfaceQuery> minPriceFragment = ProductInterfaceQuery.createFragment("minPrice", q -> q
            .priceRange(r -> r
                .minimumPrice(p -> p.addFragmentReference(priceFragment))));

        Fragment<ProductInterfaceQuery> maxPriceFragment = ProductInterfaceQuery.createFragment("maxPrice", q -> q
            .priceRange(r -> r
                .maximumPrice(p -> p.addFragmentReference(priceFragment))));

        Fragment<ProductInterfaceQuery> mediaGalleryFragment = ProductInterfaceQuery.createFragment("mediaGallery", q -> q
            .mediaGallery(g -> g
                .disabled()
                .url()
                .label()
                .position()));

        // Main query
        ProductsQueryDefinition queryArgs = q -> q
            .items(p -> p
                .addFragmentReference(simpleProductFragment)
                .addFragmentReference(minPriceFragment)
                .addFragmentReference(mediaGalleryFragment)
                .onConfigurableProduct(cp -> cp
                    .addProductInterfaceFragmentReference(maxPriceFragment)
                    .configurableOptions(o -> o
                        .label()
                        .attributeCode()
                        .values(v -> v
                            .valueIndex()
                            .label()))
                    .variants(v -> v
                        .attributes(a -> a
                            .code()
                            .valueIndex())
                        .product(vp -> vp
                            .addProductInterfaceFragmentReference(simpleProductFragment)
                            .color()
                            .addProductInterfaceFragmentReference(minPriceFragment)
                            .addProductInterfaceFragmentReference(mediaGalleryFragment))))
                .onGroupedProduct(gp -> gp
                    .items(i -> i
                        .position()
                        .qty()
                        .product(ip -> ip
                            .sku()
                            .name()
                            .addFragmentReference(minPriceFragment))))
                .onBundleProduct(bp -> bp
                    .addProductInterfaceFragmentReference(maxPriceFragment)));

        // Check that the generated query matches the reference query
        String queryString = Operations
            .query(query -> query.products(searchArgs, queryArgs))
            .addFragment(simpleProductFragment)
            .addFragment(priceFragment)
            .addFragment(minPriceFragment)
            .addFragment(maxPriceFragment)
            .addFragment(mediaGalleryFragment)
            .toString();

        Assert.assertEquals(expectedQuery, queryString);
    }

    @Test
    public void testProductQueryWithCustomFilters() throws IOException {
        String expectedQuery = getResource("queries/products-custom-filter.txt");

        // Search parameters
        ProductAttributeFilterInput filter = new ProductAttributeFilterInput()
            .setSku(new FilterEqualTypeInput()
                .setEq("whatever"))
            .setCustomFilter("equal-attribute", new FilterEqualTypeInput()
                .setEq("my-equal-value"))
            .setCustomFilter("match-attribute", new FilterMatchTypeInput()
                .setMatch("my-match-value"))
            .setCustomFilter("my-range-attribute", new FilterRangeTypeInput()
                .setFrom("range-from")
                .setTo("range-to"));
        ProductsArgumentsDefinition searchArgs = s -> s.filter(filter);

        // Main query
        ProductsQueryDefinition queryArgs = q -> q.items(TestGraphqlQueries.CONFIGURABLE_PRODUCT_QUERY);

        // Check that the generated query matches the reference query
        String queryString = Operations.query(query -> query.products(searchArgs, queryArgs)).toString();
        Assert.assertEquals(expectedQuery, queryString);
    }

    @Test
    public void testSchemaViolationErrorFlexibleMode() throws Exception {
        String jsonResponse = getResource("responses/root-category-with-unknown-field.json");

        // Enable flexible mode
        System.setProperty(AbstractResponse.UNLOCK_CUSTOM_UNSAFE_FIELDS_PROPERTY, "true");

        try {
            // Should NOT trigger a SchemaViolationError in flexible mode
            Query query = new Query(new JsonParser().parse(jsonResponse).getAsJsonObject());
            Assert.assertNotNull("Query should be created successfully in flexible mode", query);

            // The unknown field should be handled gracefully
            CategoryTree category = query.getCategory();
            Assert.assertNotNull("Category should be parsed successfully", category);
        } catch (SchemaViolationError e) {
            Assert.fail("SchemaViolationError should not be thrown in flexible mode, but got: " + e.getMessage());
        } finally {
            // Clean up system property
            System.clearProperty(AbstractResponse.UNLOCK_CUSTOM_UNSAFE_FIELDS_PROPERTY);
        }
    }

    @Test
    public void testCustomSimpleFieldTypesUnsafe() throws Exception {
        String expectedQuery = getResource("queries/category-with-simple-field.txt");
        String jsonResponse = getResource("responses/category-with-simple-field.json");

        // Category with custom simple fields of different primitive types (unsafe - without aliases)
        CategoryTreeQueryDefinition queryArgs = q -> q
            .id()
            .name()
            .addCustomSimpleFieldUnsafe("mystring")
            .addCustomSimpleFieldUnsafe("myinteger")
            .addCustomSimpleFieldUnsafe("mydouble")
            .addCustomSimpleFieldUnsafe("myboolean")
            .addCustomSimpleFieldUnsafe("myarray");

        // Search parameters
        CategoryArgumentsDefinition searchArgs = q -> q.id(3);

        String queryString = Operations.query(query -> query.category(searchArgs, queryArgs)).toString();

        // Check that the generated query matches the reference query
        Assert.assertEquals(expectedQuery, queryString);

        // Enable flexible mode to allow fields without custom field label
        System.setProperty(AbstractResponse.UNLOCK_CUSTOM_UNSAFE_FIELDS_PROPERTY, "true");

        try {
            // Use Query constructor to trigger readCustomField validation
            JsonParser parser = new JsonParser();
            Query query = new Query(parser.parse(jsonResponse).getAsJsonObject());
            CategoryTree category = query.getCategory();

            // Check that simple fields are properly parsed via readCustomField
            Assert.assertEquals(Integer.valueOf(3), category.getId());
            Assert.assertEquals("Equipment", category.getName());
            // In flexible mode, fields without _custom_ suffix are stored as JsonElements
            Assert.assertEquals("somevalue", ((com.google.gson.JsonElement) category.get("mystring")).getAsString());
            Assert.assertEquals(Integer.valueOf(42), Integer.valueOf(((com.google.gson.JsonElement) category.get("myinteger")).getAsInt()));
            Assert.assertEquals(4.2, ((com.google.gson.JsonElement) category.get("mydouble")).getAsDouble(), 0);
            Assert.assertEquals(Boolean.TRUE, Boolean.valueOf(((com.google.gson.JsonElement) category.get("myboolean")).getAsBoolean()));
            Assert.assertTrue(category.get("myarray") instanceof com.google.gson.JsonElement);
        } finally {
            // Clean up system property
            System.clearProperty(AbstractResponse.UNLOCK_CUSTOM_UNSAFE_FIELDS_PROPERTY);
        }
    }

    @Test
    public void testCustomObjectFieldsUnsafe() throws Exception {
        String expectedQuery = getResource("queries/product-with-object-field.txt");
        String jsonResponse = getResource("responses/product-with-object-field.json");

        // Search parameters
        ProductsArgumentsDefinition searchArgs = s -> s.search("short").currentPage(1);

        // Product query with custom object fields (unsafe - without aliases)
        ProductsQueryDefinition queryArgs = q -> q.items(i -> i
            .sku()
            .addCustomSimpleFieldUnsafe("erin_recommends")
            .addCustomSimpleFieldUnsafe("climate")
            .addCustomObjectFieldUnsafe("replacement_product", c -> c
                .addField("__typename")
                .addField("sku")
                .addField("name")
                .addCustomSimpleFieldUnsafe("weight"))
            .addCustomObjectFieldUnsafe("crosssell_products", c -> c
                .addField("__typename")
                .addField("sku")
                .addField("name")));

        String queryString = Operations.query(query -> query.products(searchArgs, queryArgs)).toString();

        // Check that the generated query matches the reference query
        Assert.assertEquals(expectedQuery, queryString);

        // Enable flexible mode to allow fields without custom field label
        System.setProperty(AbstractResponse.UNLOCK_CUSTOM_UNSAFE_FIELDS_PROPERTY, "true");

        try {
            // Use Query constructor to trigger readCustomField validation
            JsonParser parser = new JsonParser();
            Query query = new Query(parser.parse(jsonResponse).getAsJsonObject());
            ProductInterface product = query.getProducts().getItems().get(0);

            // Check that custom fields are properly parsed via readCustomField
            Assert.assertEquals("MSH12", product.getSku());
            // In flexible mode, fields without _custom_ suffix can be stored as various types
            Object erinRecommends = product.get("erin_recommends");
            Object climate = product.get("climate");

            // Verify the values regardless of exact type (JsonElement vs raw Java objects)
            Assert.assertTrue("erin_recommends should be 0",
                (erinRecommends instanceof Number && ((Number) erinRecommends).intValue() == 0) ||
                    (erinRecommends instanceof com.google.gson.JsonElement && ((com.google.gson.JsonElement) erinRecommends)
                        .getAsInt() == 0));
            Assert.assertTrue("climate should be '205,212,209'",
                "205,212,209".equals(climate.toString().replace("\"", "")));

            // Check that custom array and object fields work (can be various types in flexible mode)
            Object crosssellProducts = product.get("crosssell_products");
            Object replacementProduct = product.get("replacement_product");
            Assert.assertNotNull("crosssell_products should be present", crosssellProducts);
            Assert.assertNotNull("replacement_product should be present", replacementProduct);
        } finally {
            // Clean up system property
            System.clearProperty(AbstractResponse.UNLOCK_CUSTOM_UNSAFE_FIELDS_PROPERTY);
        }
    }

    @Test
    public void testProductWithCustomSimpleFieldsUnsafe() throws Exception {
        String expectedQuery = getResource("queries/product-with-simple-fields.txt");
        String jsonResponse = getResource("responses/product-with-simple-fields.json");

        // Search parameters
        ProductsArgumentsDefinition searchArgs = s -> s.search("short").currentPage(1);

        // Product query with custom simple fields (unsafe - without aliases)
        ProductsQueryDefinition queryArgs = q -> q.items(i -> i
            .sku()
            .addCustomSimpleFieldUnsafe("erin_recommends")
            .addCustomSimpleFieldUnsafe("climate")
            .addCustomSimpleFieldUnsafe("special_price")
            .addCustomSimpleFieldUnsafe("is_featured"));

        String queryString = Operations.query(query -> query.products(searchArgs, queryArgs)).toString();

        // Check that the generated query matches the reference query
        Assert.assertEquals(expectedQuery, queryString);

        // Enable flexible mode to allow fields without custom field label
        System.setProperty(AbstractResponse.UNLOCK_CUSTOM_UNSAFE_FIELDS_PROPERTY, "true");

        try {
            // Use Query constructor to trigger readCustomField validation
            JsonParser parser = new JsonParser();
            Query query = new Query(parser.parse(jsonResponse).getAsJsonObject());
            ProductInterface product = query.getProducts().getItems().get(0);

            // Check that custom simple fields are properly parsed via readCustomField
            Assert.assertEquals("MSH12", product.getSku());
            // In flexible mode, fields without _custom_ suffix can be stored as various types
            Object erinRecommends = product.get("erin_recommends");
            Object climate = product.get("climate");
            Object specialPrice = product.get("special_price");
            Object isFeatured = product.get("is_featured");

            // Verify the values regardless of exact type (JsonElement vs raw Java objects)
            Assert.assertTrue("erin_recommends should be 0",
                (erinRecommends instanceof Number && ((Number) erinRecommends).intValue() == 0) ||
                    (erinRecommends instanceof com.google.gson.JsonElement && ((com.google.gson.JsonElement) erinRecommends)
                        .getAsInt() == 0));
            Assert.assertTrue("climate should be '205,212,209'",
                "205,212,209".equals(climate.toString().replace("\"", "")));
            Assert.assertTrue("special_price should be 24.99",
                (specialPrice instanceof Number && Math.abs(((Number) specialPrice).doubleValue() - 24.99) < 0.01) ||
                    (specialPrice instanceof com.google.gson.JsonElement && Math.abs(((com.google.gson.JsonElement) specialPrice)
                        .getAsDouble() - 24.99) < 0.01));
            Assert.assertTrue("is_featured should be true",
                Boolean.TRUE.equals(isFeatured) ||
                    (isFeatured instanceof com.google.gson.JsonElement && ((com.google.gson.JsonElement) isFeatured).getAsBoolean()));
        } finally {
            // Clean up system property
            System.clearProperty(AbstractResponse.UNLOCK_CUSTOM_UNSAFE_FIELDS_PROPERTY);
        }
    }

}
