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

import com.shopify.graphql.support.Input;

/**
 * An input object that specifies the filters used in product aggregations.
 */
public class AggregationsFilterInput implements Serializable {
    private Input<AggregationsCategoryFilterInput> category = Input.undefined();

    /**
     * Filter category aggregations in layered navigation.
     */
    public AggregationsCategoryFilterInput getCategory() {
        return category.getValue();
    }

    /**
     * Filter category aggregations in layered navigation.
     */
    public Input<AggregationsCategoryFilterInput> getCategoryInput() {
        return category;
    }

    /**
     * Filter category aggregations in layered navigation.
     */
    public AggregationsFilterInput setCategory(AggregationsCategoryFilterInput category) {
        this.category = Input.optional(category);
        return this;
    }

    /**
     * Filter category aggregations in layered navigation.
     */
    public AggregationsFilterInput setCategoryInput(Input<AggregationsCategoryFilterInput> category) {
        if (category == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.category = category;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.category.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("category:");
            if (category.getValue() != null) {
                category.getValue().appendTo(_queryBuilder);
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
