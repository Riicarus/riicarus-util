package com.riicarus.util.exception;

/**
 * [FEATURE INFO]<br/>
 * 空对象异常
 *
 * @author Riicarus
 * @create 2022-11-22 0:45
 * @since 1.0.0
 */
public class NullObjectException extends AssertsFailException {

    public NullObjectException(String message) {
        super(message);
    }

}
