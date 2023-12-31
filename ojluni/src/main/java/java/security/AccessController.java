/*
 * Copyright (C) 2014 The Android Open Source Project
 * Copyright (c) 1997, 2019, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package java.security;

import sun.security.util.Debug;
import jdk.internal.reflect.CallerSensitive;
import jdk.internal.reflect.Reflection;

// Android-changed: Stubbed the implementation.  Android doesn't support SecurityManager.
// See comments in java.lang.SecurityManager for details.
/**
 * Android doesn't support {@link SecurityManager}. Do not use this class.
 */
public final class AccessController {

    private AccessController() { }

    /**
     * Calls {@code action.run()}.
     */
    public static <T> T doPrivileged(PrivilegedAction<T> action) {
        return action.run();
    }

    /**
     * Calls {@code action.run()}.
     */
    public static <T> T doPrivilegedWithCombiner(PrivilegedAction<T> action) {
        return action.run();
    }


    /**
     * Calls {@code action.run()}.
     */
    public static <T> T doPrivileged(PrivilegedAction<T> action,
                                     AccessControlContext context) {
        return action.run();
    }

    /**
     * Calls {@code action.run()}.
     *
     * @hide
     */
    public static <T> T doPrivilegedWithCombiner(PrivilegedAction<T> action,
        AccessControlContext context, Permission... perms) {
        return doPrivileged(action);
    }

    /**
     * Calls {@code action.run()}.
     */
    public static <T> T
        doPrivileged(PrivilegedExceptionAction<T> action)
        throws PrivilegedActionException {
        try {
            return action.run();
        } catch (Exception e) {
            throw new PrivilegedActionException(e);
        }
    }


    /**
     * Calls {@code action.run()}.
     */
    public static <T> T doPrivilegedWithCombiner(PrivilegedExceptionAction<T> action)
        throws PrivilegedActionException
    {
        return doPrivileged(action);
    }


    /**
     * Calls {@code action.run()}.
     */
    public static <T> T
        doPrivileged(PrivilegedExceptionAction<T> action,
                     AccessControlContext context)
        throws PrivilegedActionException {
        return doPrivileged(action);
    }

    /**
     * Calls {@code action.run()}.
     *
     * @hide
     */
    public static <T> T doPrivileged(PrivilegedExceptionAction<T> action,
                                     AccessControlContext context, Permission... perms)
        throws PrivilegedActionException
    {
        return doPrivileged(action);
    }

    /**
     * Calls {@code action.run()}.
     *
     * @hide
     */
    public static <T> T doPrivilegedWithCombiner(PrivilegedExceptionAction<T> action,
            AccessControlContext context,
            Permission... perms)
            throws PrivilegedActionException
    {
        return doPrivileged(action);
    }

    /**
     * Calls {@code action.run()}.
     *
     * @hide
     */
    public static <T> T doPrivileged(PrivilegedAction<T> action,
            AccessControlContext context, Permission... perms) {
        return doPrivileged(action);
    }

    public static AccessControlContext getContext() {
        return new AccessControlContext(null);
    }

    public static void checkPermission(Permission perm)
                 throws AccessControlException {
    }
}
