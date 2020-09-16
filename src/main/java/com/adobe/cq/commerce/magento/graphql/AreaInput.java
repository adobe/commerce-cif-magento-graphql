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

/**
 * AreaInput defines the parameters which will be used for filter by specified location.
 */
public class AreaInput implements Serializable {
    private int radius;

    private String searchTerm;

    public AreaInput(int radius, String searchTerm) {
        this.radius = radius;

        this.searchTerm = searchTerm;
    }

    /**
     * The radius for the search in KM.
     */
    public int getRadius() {
        return radius;
    }

    /**
     * The radius for the search in KM.
     */
    public AreaInput setRadius(int radius) {
        this.radius = radius;
        return this;
    }

    /**
     * The country code where search must be performed. Required parameter together with region, city or
     * postcode.
     */
    public String getSearchTerm() {
        return searchTerm;
    }

    /**
     * The country code where search must be performed. Required parameter together with region, city or
     * postcode.
     */
    public AreaInput setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("radius:");
        _queryBuilder.append(radius);

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("search_term:");
        AbstractQuery.appendQuotedString(_queryBuilder, searchTerm.toString());

        _queryBuilder.append('}');
    }
}
