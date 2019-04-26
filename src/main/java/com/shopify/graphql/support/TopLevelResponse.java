/**
 * Copyright 2015 Shopify
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software
 * is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.shopify.graphql.support;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Created by eapache on 2015-11-17.
 */
public class TopLevelResponse {
    private static final String DATA_KEY = "data";
    private static final String ERRORS_KEY = "errors";
    private JsonObject data = null;
    private final List<Error> errors = new ArrayList<>();

    public TopLevelResponse(JsonObject fields) throws InvalidGraphQLException {
        JsonElement errorsElement = fields.get(ERRORS_KEY);
        JsonElement dataElement = fields.get(DATA_KEY);
        if (dataElement != null && dataElement.isJsonNull()) {
            dataElement = null;
        }

        if (errorsElement == null && dataElement == null) {
            throw new InvalidGraphQLException("Response must contain a top-level 'data' or 'errors' entry");
        }

        if (dataElement != null) {
            if (!dataElement.isJsonObject()) {
                throw new InvalidGraphQLException("'data' entry in response must be a map");
            }
            this.data = dataElement.getAsJsonObject();
        }

        if (errorsElement != null) {
            if (!errorsElement.isJsonArray()) {
                throw new InvalidGraphQLException("'errors' entry in response must be an array");
            }
            for (JsonElement error : errorsElement.getAsJsonArray()) {
                errors.add(new Error(error.isJsonObject() ? error.getAsJsonObject() : new JsonObject()));
            }
        }
    }

    public JsonObject getData() {
        return data;
    }

    public List<Error> getErrors() {
        return errors;
    }
}
