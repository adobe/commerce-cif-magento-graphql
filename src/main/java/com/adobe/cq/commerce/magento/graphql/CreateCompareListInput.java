/*******************************************************************************
 *
 *    Copyright 2020 Adobe. All rights reserved.
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

import java.io.Serializable;
import java.util.List;

import com.shopify.graphql.support.AbstractQuery;
import com.shopify.graphql.support.ID;
import com.shopify.graphql.support.Input;

/**
 * Contains an array of product IDs to use for creating a compare list.
 */
public class CreateCompareListInput implements Serializable {
    private Input<List<ID>> products = Input.undefined();

    /**
     * An array of product IDs to add to the compare list.
     */
    public List<ID> getProducts() {
        return products.getValue();
    }

    /**
     * An array of product IDs to add to the compare list.
     */
    public Input<List<ID>> getProductsInput() {
        return products;
    }

    /**
     * An array of product IDs to add to the compare list.
     */
    public CreateCompareListInput setProducts(List<ID> products) {
        this.products = Input.optional(products);
        return this;
    }

    /**
     * An array of product IDs to add to the compare list.
     */
    public CreateCompareListInput setProductsInput(Input<List<ID>> products) {
        if (products == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.products = products;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.products.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("products:");
            if (products.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : products.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        AbstractQuery.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
