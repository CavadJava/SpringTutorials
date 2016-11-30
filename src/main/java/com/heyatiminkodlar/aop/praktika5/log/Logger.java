package com.heyatiminkodlar.aop.praktika5.log;

import java.util.Date;

/**
 * Created by root on 11/17/16.
 */
public class Logger {
    public static void info(String info){
        System.out.println(new Date() + "----->" + info);
    }
}
