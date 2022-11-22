package com.riicarus.util.exception;

/**
 * [FEATURE INFO]<br/>
 * 空集合异常
 *
 * @author Riicarus
 * @create 2022-11-22 0:54
 * @since 1.0.0
 */
public class EmptyCollectionException extends AssertsFailException {

    public EmptyCollectionException(String message) {
        super(message);
    }

    public EmptyCollectionException(String message, Throwable cause) {
        super(message, cause);
    }
}
