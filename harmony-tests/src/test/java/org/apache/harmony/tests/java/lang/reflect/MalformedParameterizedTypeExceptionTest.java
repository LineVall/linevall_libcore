/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.harmony.tests.java.lang.reflect;

import java.lang.reflect.MalformedParameterizedTypeException;
import junit.framework.TestCase;

public class MalformedParameterizedTypeExceptionTest extends TestCase {

    /**
     * java.lang.reflect.MalformedParameterizedTypeException#
     * MalformedParameterizedTypeException()
     */
    public void testMalformedParameterizedTypeException() {
        MalformedParameterizedTypeException e = new MalformedParameterizedTypeException();
        assertNotNull(e);
        assertNull(e.getMessage());
    }

    public void testMalformedParameterizedTypeExceptionWithMessage() {
        MalformedParameterizedTypeException e = new MalformedParameterizedTypeException("message");
        assertNotNull(e);
        assertEquals(e.getMessage(), "message");
    }
}
