package com.riicarus.util.exception;

/**
 * [FEATURE INFO]<br/>
 * 断言错误异常<br/>
 * 继承自 RuntimeException, 作为所有在断言中抛出异常的父类.<br/>
 * Asserts.fail() 方法会直接抛出该异常.
 *
 * @author Riicarus
 * @create 2022-11-22 12:56
 * @since 1.0.0
 */
public class AssertsFailException extends RuntimeException {

    public AssertsFailException(String message) {
        super(message);
    }

    public AssertsFailException(String message, Throwable cause) {
        super(message, cause);
    }
}
