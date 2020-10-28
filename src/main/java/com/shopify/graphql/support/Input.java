/**
 * Copyright 2017 Shopify
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

/**
 * Created by henrytao on 9/7/17.
 */

public final class Input<T> implements Serializable {

    private final T value;
    private final boolean defined;

    public static <T> Input<T> value(@Nullable T value) {
        return new Input<>(value, true);
    }

    public static <T> Input<T> optional(@Nullable T value) {
        return value != null ? value(value) : Input.<T>undefined();
    }

    public static <T> Input<T> undefined() {
        return new Input<>(null, false);
    }

    private Input(T value, boolean defined) {
        this.value = value;
        this.defined = defined;
    }

    public T getValue() {
        return value;
    }

    public boolean isDefined() {
        return defined;
    }
}
