package com.heyatiminkodlar.aop.praktika6.proxy;

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
        if (method.getName().equals("add") || method.getName().equals("delete")){
            Logger.info("LogProxy");
        }
        Object obj = method.invoke(target,args);
        return obj;
    }
}
