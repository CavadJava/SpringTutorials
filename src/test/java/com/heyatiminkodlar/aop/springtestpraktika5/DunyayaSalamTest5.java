package com.heyatiminkodlar.aop.springtestpraktika5;

import com.heyatiminkodlar.aop.praktika5.action.UserAction;
import com.heyatiminkodlar.aop.praktika5.user.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 11/17/16.
 */
public class DunyayaSalamTest5 {


    private BeanFactory factory = new ClassPathXmlApplicationContext("aop/praktika5.xml");

    @Test
    public void testIoc() {
        UserAction ua = factory.getBean("user5Action",UserAction.class);
        User u = new User();
        u.setName("Cavad");
        u.setId(01);
        ua.setUser(u);
        ua.add();
        ua.delete();

/*
        UserAction ua2 = factory.getBean("user5Action", UserAction.class);
        ua2.add();
*/
    }
}