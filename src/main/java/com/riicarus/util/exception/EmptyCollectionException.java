package com.riicarus.util.exception;

/**
 * [FEATURE INFO]<br/>
 * 空集合异常
 *
 * @author Skyline
 * @create 2022-11-22 0:54
 * @since 1.0.0
 */
public class EmptyCollectionException extends RuntimeException {

    public EmptyCollectionException(String message) {
        super(message);
    }
}
