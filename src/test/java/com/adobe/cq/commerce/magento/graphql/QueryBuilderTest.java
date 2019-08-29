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
import com.shopify.graphql.support.AbstractQuery;

public class QueryBuilderTest {

    private String getResource(String filename) throws IOException {
        return IOUtils.toString(QueryBuilderTest.class.getClassLoader().getResourceAsStream(filename), StandardCharsets.UTF_8);
    }

    @Test
    public void testProductQuery() throws IOException {
        String expectedQuery = getResource("queries/product-by-sku.txt");
        String jsonResponse = getResource("responses/product-by-sku.json");

        // Search parameters
        FilterTypeInput input = new FilterTypeInput().setEq("whatever");
        ProductFilterInput filter = new ProductFilterInput().setSku(input);
        ProductsArgumentsDefinition searchArgs = s -> s.filter(filter);

        // Main query
        ProductsQueryDefinition queryArgs = q -> q.items(TestGraphqlQueries.CONFIGURABLE_PRODUCT_QUERY);

        // Check that the generated query matches the reference query
        String queryString = Operations.query(query -> query.products(searchArgs, queryArgs)).toString();
        Assert.assertEquals(expectedQuery, queryString);

        // Check that the reference response can be parsed and fields are properly set
        Query query = QueryDeserializer.getGson().fromJson(jsonResponse, Query.class);
        ProductInterface product = query.getProducts().getItems().get(0);

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
}
