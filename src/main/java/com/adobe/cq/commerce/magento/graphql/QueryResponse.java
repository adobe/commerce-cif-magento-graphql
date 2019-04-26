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

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;

public class QueryResponse {
    private TopLevelResponse response;
    private Query data;

    public QueryResponse(TopLevelResponse response) throws SchemaViolationError {
        this.response = response;
        this.data = response.getData() != null ? new Query(response.getData()) : null;
    }

    public Query getData() {
        return data;
    }

    public List<Error> getErrors() {
        return response.getErrors();
    }

    public String toJson() {
        return new Gson().toJson(response);
    }

    public String prettyPrintJson() {
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(response);
    }

    public static QueryResponse fromJson(String json) throws SchemaViolationError {
        final TopLevelResponse response = new Gson().fromJson(json, TopLevelResponse.class);
        return new QueryResponse(response);
    }
}