package com.heyatiminkodlar.aop.praktika7.proxy;

import com.heyatiminkodlar.aop.praktika7.user.LogInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by root on 11/17/16.
 */
public class LogProxy implements InvocationHandler {
    private LogProxy(){}

    private Object target;

    public static Object getInstance(Object o){
        LogProxy proxy = new LogProxy();

        proxy.target = o;

        Object result = Proxy.newProxyInstance(o.getClass().getClassLoader(),o.getClass().getInterfaces(),proxy);

        return result;
    }

    //<bean making please look UserDynamicDao
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /*if (method.getName().equals("add") || method.getName().equals("delete")){
            Logger.info("LogProxy");
        }*/

        Object obj = method.invoke(target,args);
        if(method.isAnnotationPresent(LogInfo.class)){
            LogInfo li = method.getAnnotation(LogInfo.class);
            Logger.info("isAnnotationPresent by LogProxy:" + li.value());
        }
        return obj;
    }
}
