package com.riicarus.util;

import com.riicarus.util.exception.EmptyCollectionException;
import com.riicarus.util.exception.EmptyStringException;
import com.riicarus.util.exception.NullObjectException;

import java.util.Collection;

/**
 * [FEATURE INFO]<br/>
 * 断言类, 会抛出对应的异常.
 *
 * @author Skyline
 * @create 2022-11-22 0:19
 * @since 1.0.0
 */
public class Asserts {

    private static final String ASSERTS_FAIL_MESSAGE_PREFIX = "Asserts failed, message: ";
    private static final String EMPTY_STRING = "";

    public static Object notNull(Object o, String message) {
        if (o == null) {
            throw new NullObjectException(ASSERTS_FAIL_MESSAGE_PREFIX + message);
        }

        return o;
    }

    public static Collection<?> notEmpty(Collection<?> collection, String message) {
        if (collection.isEmpty()) {
            throw new EmptyCollectionException(ASSERTS_FAIL_MESSAGE_PREFIX + message);
        }

        return collection;
    }

    public static String notEmpty(String string, String message) {
        if (EMPTY_STRING.equals(string.trim())) {
            throw new EmptyStringException(ASSERTS_FAIL_MESSAGE_PREFIX + message);
        }

        return string;
    }
}
