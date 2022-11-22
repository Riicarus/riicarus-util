package com.riicarus.util.exception;

/**
 * [FEATURE INFO]<br/>
 * 类型错误异常
 *
 * @author Riicarus
 * @create 2022-11-22 21:38
 * @since 1.0.0
 */
public class TypeWrongException extends AssertsFailException {

    public TypeWrongException(String message) {
        super(message);
    }

    public TypeWrongException(String message, Throwable cause) {
        super(message, cause);
    }
}
