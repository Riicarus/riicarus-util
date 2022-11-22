package com.riicarus.util;

import com.riicarus.util.exception.*;

import java.util.Collection;
import java.util.Map;

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

    /**
     * 失败
     *
     * @param message 提示信息
     * @throws AssertsFailException 断言失败异常, 运行时异常
     */
    public static void fail(String message) throws AssertsFailException {
        throw new AssertsFailException(ASSERTS_FAIL_MESSAGE_PREFIX + message);
    }

    /**
     * 失败
     *
     * @param message 提示信息
     * @param cause 产生原因
     * @throws AssertsFailException 断言失败异常, 运行时异常
     */
    public static void fail(String message, Throwable cause) throws AssertsFailException {
        throw new AssertsFailException(ASSERTS_FAIL_MESSAGE_PREFIX + message, cause);
    }

    /**
     * 判断是否不为空
     *
     * @param o 受判对象
     * @param message 提示信息
     * @throws NullObjectException 空对象异常, 运行时异常
     */
    public static void notNull(Object o, String message) throws NullObjectException {
        if (o == null) {
            throw new NullObjectException(ASSERTS_FAIL_MESSAGE_PREFIX + message);
        }
    }

    /**
     * 判断是否不为空
     *
     * @param o 受判对象
     * @param exception 要抛出的异常, 运行时异常
     * @throws RuntimeException 运行时异常
     */
    public static void notNull(Object o, RuntimeException exception) throws RuntimeException {
        if (o == null) {
            throw exception;
        }
    }

    /**
     * 判断是否不为空集合
     *
     * @param collection 受判集合对象
     * @param message 提示信息
     * @throws NullObjectException 空对象异常, 运行时异常
     * @throws EmptyCollectionException 空集合异常, 运行时异常
     */
    public static void notEmpty(Collection<?> collection, String message) throws NullObjectException, EmptyCollectionException {
        notNull(collection, message);

        if (collection.isEmpty()) {
            throw new EmptyCollectionException(ASSERTS_FAIL_MESSAGE_PREFIX + message);
        }
    }

    /**
     * 判断是否不为空集合
     *
     * @param collection 受判集合对象
     * @param exception 要抛出的异常, 运行时异常
     * @throws RuntimeException 运行时异常
     */
    public static void notEmpty(Collection<?> collection, RuntimeException exception) throws RuntimeException {
        notNull(collection, exception);

        if (collection.isEmpty()) {
            throw exception;
        }
    }

    /**
     * 判断是否不为空表
     *
     * @param map 受判表对象
     * @param message 提示信息
     * @throws NullObjectException 空对象异常, 运行时异常
     * @throws EmptyMapException 空表异常, 运行时异常
     */
    public static void notEmpty(Map<?, ?> map, String message) throws NullObjectException, EmptyMapException {
        notNull(map, message);

        if (map.isEmpty()) {
            throw new EmptyMapException(ASSERTS_FAIL_MESSAGE_PREFIX + message);
        }
    }

    /**
     * 判断是否不为空表
     *
     * @param map 受判表对象
     * @param exception 要抛出的异常, 运行时异常
     * @throws RuntimeException 运行时异常
     */
    public static void notEmpty(Map<?, ?> map, RuntimeException exception) throws RuntimeException {
        notNull(map, exception);

        if (map.isEmpty()) {
            throw exception;
        }
    }

    /**
     * 判断是否部位空字符串
     *
     * @param string 受判字符串对象
     * @param message 提示信息
     * @throws NullObjectException 空对象异常, 运行时异常
     * @throws EmptyStringException 空字符串异常, 运行时异常
     */
    public static void notEmpty(String string, String message) throws NullObjectException, EmptyStringException {
        notNull(string, message);

        if (EMPTY_STRING.equals(string.trim())) {
            throw new EmptyStringException(ASSERTS_FAIL_MESSAGE_PREFIX + message);
        }
    }

    /**
     * 判断是否不为字符串
     *
     * @param string 受判字符串对象
     * @param exception 要抛出的异常, 运行时异常
     * @throws RuntimeException 运行时异常
     */
    public static void notEmpty(String string, RuntimeException exception) throws RuntimeException {
        notNull(string, exception);

        if (EMPTY_STRING.equals(string.trim())) {
            throw exception;
        }
    }

    /**
     * 判断是否为子类/实现类
     *
     * @param obj 被判断对象
     * @param type 被判断对象应该匹配的类型
     * @param message 提示信息
     * @param <T> 被判断对象泛型
     * @throws TypeWrongException 类型错误异常, 运行时异常
     */
    public static <T> void instanceOf(T obj, Class<?> type, String message) throws TypeWrongException {
        notNull(type, "Type to check against can not be null");
        if (!type.isInstance(obj)) {
            throw new TypeWrongException(message);
        }
    }

    /**
     * 判断是否为子类/实现类
     *
     * @param obj 被判断对象
     * @param type 被判断对象应该匹配的类型
     * @param exception 要抛出的异常, 运行时异常
     * @param <T> 被判断对象泛型
     * @throws RuntimeException 运行时异常
     */
    public static <T> void instanceOf(T obj, Class<?> type, RuntimeException exception) throws RuntimeException {
        notNull(type, "Type to check against can not be null");
        if (!type.isInstance(obj)) {
            throw exception;
        }
    }

    /**
     * 判断是否不为子类/实现类
     *
     * @param obj 被判断对象
     * @param type 被判断对象不应该匹配的类型
     * @param message 提示信息
     * @param <T> 被判断对象泛型
     * @throws TypeWrongException 类型错误异常, 运行时异常
     */
    public static <T> void notInstanceOf(T obj, Class<?> type, String message) throws TypeWrongException {
        notNull(type, "Type to check against can not be null");
        if (type.isInstance(obj)) {
            throw new TypeWrongException(message);
        }
    }

    /**
     * 判断是否为子类/实现类
     *
     * @param obj 被判断对象
     * @param type 被判断对象应该匹配的类型
     * @param exception 要抛出的异常, 运行时异常
     * @param <T> 被判断对象泛型
     * @throws RuntimeException 运行时异常
     */
    public static <T> void notInstanceOf(T obj, Class<?> type, RuntimeException exception) throws RuntimeException {
        notNull(type, "Type to check against can not be null");
        if (type.isInstance(obj)) {
            throw exception;
        }
    }

    /**
     * 判断是否为 true
     *
     * @param flag 被判断对象
     * @param message 提示信息
     * @throws BoolWrongException 布尔类型值异常, 运行时异常
     */
    public static void isTrue(boolean flag, String message) throws BoolWrongException {
        if (!flag) {
            throw new BoolWrongException(message);
        }
    }

    /**
     * 判断是否为 true
     *
     * @param flag 被判断对象
     * @param exception 要抛出的异常, 运行时异常
     * @throws RuntimeException 运行时异常
     */
    public static void isTrue(boolean flag, RuntimeException exception) throws RuntimeException {
        if (!flag) {
            throw exception;
        }
    }


    /**
     * 判断是否为 false
     *
     * @param flag 被判断对象
     * @param message 提示信息
     * @throws BoolWrongException 布尔类型值异常, 运行时异常
     */
    public static void isFalse(boolean flag, String message) throws BoolWrongException {
        if (flag) {
            throw new BoolWrongException(message);
        }
    }

    /**
     * 判断是否为 false
     *
     * @param flag 被判断对象
     * @param exception 要抛出的异常, 运行时异常
     * @throws RuntimeException 运行时异常
     */
    public static void isFalse(boolean flag, RuntimeException exception) throws RuntimeException {
        if (flag) {
            throw exception;
        }
    }
}
