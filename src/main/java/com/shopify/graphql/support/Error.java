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

import java.io.Serializable;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Created by eapache on 2015-11-17.
 */
public class Error implements Serializable {
    private final String message;
    private final int line;
    private final int column;


    public Error(String message) {
        this.message = message;
        line = 0;
        column = 0;
    }

    public Error(JsonObject fields) {
        JsonElement message = fields.get("message");
        if (message != null && message.isJsonPrimitive() && message.getAsJsonPrimitive().isString()) {
            this.message = message.getAsString();
        } else {
            this.message = "Unknown error";
        }

        JsonElement line = fields.get("line");
        if (line != null && line.isJsonPrimitive() && line.getAsJsonPrimitive().isNumber()) {
            this.line = line.getAsInt();
        } else {
            this.line = 0;
        }

        JsonElement column = fields.get("column");
        if (column != null && column.isJsonPrimitive() && column.getAsJsonPrimitive().isNumber()) {
            this.column = column.getAsInt();
        } else {
            this.column = 0;
        }
    }

    @Override
    public String toString() {
        return message();
    }

    public String message() {
        return message;
    }

    public int line() {
        return line;
    }

    public int column() {
        return column;
    }
}
