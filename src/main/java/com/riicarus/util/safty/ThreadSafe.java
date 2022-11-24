package com.riicarus.util.safty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * [FEATURE INFO]<br/>
 * 表示被注释的类是线程安全的类
 *
 * @author Riicarus
 * @create 2022-11-7 23:19
 * @since 1.0.0
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface ThreadSafe {
}
