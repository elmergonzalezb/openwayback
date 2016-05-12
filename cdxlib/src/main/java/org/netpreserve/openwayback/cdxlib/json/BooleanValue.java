/*
 * Copyright 2016 IIPC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.netpreserve.openwayback.cdxlib.json;

/**
 *
 */
public class BooleanValue implements Value {

    public static final BooleanValue TRUE = new BooleanValue(Boolean.TRUE);

    public static final BooleanValue FALSE = new BooleanValue(Boolean.FALSE);

    private final Boolean value;

    private BooleanValue(Boolean value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }

}