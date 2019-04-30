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

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dylansmith on 2015-11-20.
 */
public abstract class Arguments {
    private final StringBuilder query;
    private final Set<String> arguments = new HashSet<>();
    private boolean firstArgument;

    protected Arguments(StringBuilder query, boolean firstArgument) {
        this.query = query;
        this.firstArgument = firstArgument;
    }

    public static void end(Arguments arguments) {
        if (!arguments.firstArgument) {
            arguments.query.append(')');
        }
    }

    protected void startArgument(String name) {
        if (!arguments.add(name)) {
            throw new RuntimeException("Already specified argument " + name);
        }
        if (firstArgument) {
            firstArgument = false;
            query.append('(');
        } else {
            query.append(',');
        }
        query.append(name);
        query.append(':');
    }
}
