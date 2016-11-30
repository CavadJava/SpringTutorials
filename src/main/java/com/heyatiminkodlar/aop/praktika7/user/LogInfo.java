package com.heyatiminkodlar.aop.praktika7.user;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by root on 11/17/16.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface LogInfo {
    public String value() default "";
}
