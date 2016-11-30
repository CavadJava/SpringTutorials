package com.heyatiminkodlar.aop.praktika9.proxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;


/**
 * Created by root on 11/29/16.
 */
@Component("logAspect") // Let this aspect class be managed by Spring
/*
@Aspect // declares that this class is a facet class
*/
public class LogAspect {

    /**
     * execution(* com.heyatiminkodlar.aop.praktika9.dao.*.add*(..))
     * The first * represents any return value
     * The second * represents all the classes in the com.heyatiminkodlar.aop.praktika9.dao package
     * The third * means all methods starting with add
     * (..) represents any parameter
     */
    /*@Before("execution(* com.heyatiminkodlar.aop.praktika9.dao.*.add*(..))|| " +
            "execution(* com.heyatiminkodlar.aop.praktika9.dao.*.delete*(..))||" +
            "execution(* com.heyatiminkodlar.aop.praktika9.dao.*.update*(..))")*/
    public void logStart(JoinPoint jp) {
        //Get the implementation of the object
        System.out.println(jp.getTarget());
        //Get the implementation of the method
        System.out.println(jp.getSignature().getName());
        Logger.info("Join the log");
        System.out.println(new Date()+"------log------");
    }

    /**
     * The function call is executed after completion
     * @param jp
     */

    /*@After("execution(* com.heyatiminkodlar.aop.praktika9.dao.*.add*(..))|| " +
            "execution(* com.heyatiminkodlar.aop.praktika9.dao.*.delete*(..))||" +
            "execution(* com.heyatiminkodlar.aop.praktika9.dao.*.update*(..))")*/
    public void logEnd(JoinPoint jp) {
        Logger.info("The method call ends with the log");
    }

    /**
     * Function call
     * @param pjp
     * @throws Throwable
     */
    /*@Around("execution(* com.heyatiminkodlar.aop.praktika9.dao.*.add*(..))|| " +
            "execution(* com.heyatiminkodlar.aop.praktika9.dao.*.delete*(..))||" +
            "execution(* com.heyatiminkodlar.aop.praktika9.dao.*.update*(..))")*/
    public void logAround(ProceedingJoinPoint pjp) throws Throwable {
        Logger.info("Began to join the log in Around");
        pjp.proceed();//execute program
        Logger.info("End Around");
    }



}
