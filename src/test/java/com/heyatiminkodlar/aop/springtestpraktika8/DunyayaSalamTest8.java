package com.heyatiminkodlar.aop.springtestpraktika8;


import com.heyatiminkodlar.aop.praktika8.action.UserAction;
import com.heyatiminkodlar.aop.praktika8.user.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 11/17/16.
 */
public class DunyayaSalamTest8 {


    private BeanFactory factory = new ClassPathXmlApplicationContext("aop/praktika8.xml");

    @Test
    public void testIoc() {
        UserAction ua = factory.getBean("user8Action",UserAction.class);
        User u = new User();
        u.setName("Cavad");
        u.setId(01);
        ua.setUser(u);
        ua.add();
        ua.delete();
        ua.load();
/*
        UserAction ua2 = factory.getBean("user8Action", UserAction.class);
        ua2.add();*/
    }
}