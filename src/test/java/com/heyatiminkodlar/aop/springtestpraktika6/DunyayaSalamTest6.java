package com.heyatiminkodlar.aop.springtestpraktika6;


import com.heyatiminkodlar.aop.praktika6.action.UserAction;
import com.heyatiminkodlar.aop.praktika6.user.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 11/17/16.
 */
public class DunyayaSalamTest6 {


    private BeanFactory factory = new ClassPathXmlApplicationContext("aop/praktika6.xml");

    @Test
    public void testIoc() {
        UserAction ua = factory.getBean("user6Action",UserAction.class);
        User u = new User();
        u.setName("Cavad");
        u.setId(01);
        ua.setUser(u);
        ua.add();
        ua.delete();
        ua.load();
/*
        UserAction ua2 = factory.getBean("user6Action", UserAction.class);
        ua2.add();*/
    }
}