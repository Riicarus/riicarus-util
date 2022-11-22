package com.riicarus.util.exception;

/**
 * [FEATURE INFO]<br/>
 * 空表异常
 *
 * @author Riicarus
 * @create 2022-11-22 20:45
 * @since 1.0.0
 */
public class EmptyMapException extends AssertsFailException {

    public EmptyMapException(String message) {
        super(message);
    }

    public EmptyMapException(String message, Throwable cause) {
        super(message, cause);
    }
}
