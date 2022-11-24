package com.riicarus.util.safty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * [FEATURE INFO]<br/>
 * 当前属性/方法受什么保护
 *
 * @author Riicarus
 * @create 2022-11-7 23:07
 * @since 1.0.0
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD})
public @interface GuardBy {

    String name();

}
