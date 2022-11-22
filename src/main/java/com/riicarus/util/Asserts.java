package com.riicarus.util;

import com.riicarus.util.exception.AssertsFailException;
import com.riicarus.util.exception.EmptyCollectionException;
import com.riicarus.util.exception.EmptyStringException;
import com.riicarus.util.exception.NullObjectException;

import java.util.Collection;

/**
 * [FEATURE INFO]<br/>
 * 断言类, 会抛出对应的异常.
 *
 * @author Riicarus
 * @create 2022-11-22 0:19
 * @since 1.0.0
 */
public class Asserts {

    private static final String ASSERTS_FAIL_MESSAGE_PREFIX = "Asserts failed. Message: ";
    private static final String EMPTY_STRING = "";

    public static void fail(String message) {
        throw new AssertsFailException(ASSERTS_FAIL_MESSAGE_PREFIX + message);
    }

    public static void fail(String message, Throwable cause) {
        throw new AssertsFailException(ASSERTS_FAIL_MESSAGE_PREFIX + message, cause);
    }

    public static void notNull(Object o, String message) {
        if (o == null) {
            throw new NullObjectException(ASSERTS_FAIL_MESSAGE_PREFIX + message);
        }
    }

    public static void notEmpty(Collection<?> collection, String message) {
        notNull(collection, message);

        if (collection.isEmpty()) {
            throw new EmptyCollectionException(ASSERTS_FAIL_MESSAGE_PREFIX + message);
        }
    }

    public static void notEmpty(String string, String message) {
        notNull(string, message);

        if (EMPTY_STRING.equals(string.trim())) {
            throw new EmptyStringException(ASSERTS_FAIL_MESSAGE_PREFIX + message);
        }
    }
}
