package com.riicarus.util.exception;

/**
 * [FEATURE INFO]<br/>
 * 布尔类型值错误异常
 *
 * @author Riicarus
 * @create 2022-11-22 21:53
 * @since 1.0.0
 */
public class BoolWrongException extends AssertsFailException {

    public BoolWrongException(String message) {
        super(message);
    }

    public BoolWrongException(String message, Throwable cause) {
        super(message, cause);
    }
}
