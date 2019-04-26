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

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.SchemaViolationError;

/**
* ProductMediaGalleryEntriesContent contains an image in base64 format and basic information about the
* image
*/
public class ProductMediaGalleryEntriesContent extends AbstractResponse<ProductMediaGalleryEntriesContent> {
    public ProductMediaGalleryEntriesContent() {
    }

    public ProductMediaGalleryEntriesContent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "base64_encoded_data": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "name": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "type": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "ProductMediaGalleryEntriesContent";
    }

    /**
    * The image in base64 format
    */

    public String getBase64EncodedData() {
        return (String) get("base64_encoded_data");
    }

    public ProductMediaGalleryEntriesContent setBase64EncodedData(String arg) {
        optimisticData.put(getKey("base64_encoded_data"), arg);
        return this;
    }

    /**
    * The file name of the image
    */

    public String getName() {
        return (String) get("name");
    }

    public ProductMediaGalleryEntriesContent setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The MIME type of the file, such as image/png
    */

    public String getType() {
        return (String) get("type");
    }

    public ProductMediaGalleryEntriesContent setType(String arg) {
        optimisticData.put(getKey("type"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "base64_encoded_data": return false;

            case "name": return false;

            case "type": return false;

            default: return false;
        }
    }
}

