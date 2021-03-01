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

import com.shopify.graphql.support.AbstractQuery;

public class ProductReviewRatingInput implements Serializable {
    private String id;

    private String valueId;

    public ProductReviewRatingInput(String id, String valueId) {
        this.id = id;

        this.valueId = valueId;
    }

    /**
     * An encoded rating ID.
     */
    public String getId() {
        return id;
    }

    /**
     * An encoded rating ID.
     */
    public ProductReviewRatingInput setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * An encoded rating value id.
     */
    public String getValueId() {
        return valueId;
    }

    /**
     * An encoded rating value id.
     */
    public ProductReviewRatingInput setValueId(String valueId) {
        this.valueId = valueId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("id:");
        AbstractQuery.appendQuotedString(_queryBuilder, id.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("value_id:");
        AbstractQuery.appendQuotedString(_queryBuilder, valueId.toString());

        _queryBuilder.append('}');
    }
}
