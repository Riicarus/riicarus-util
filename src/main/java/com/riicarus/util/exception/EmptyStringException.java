package com.riicarus.util.exception;

/**
 * [FEATURE INFO]<br/>
 * 空字符串异常
 *
 * @author Riicarus
 * @create 2022-11-22 1:06
 * @since 1.0.0
 */
public class EmptyStringException extends AssertsFailException {

    public EmptyStringException(String message) {
        super(message);
    }

}
