package com.heyatiminkodlar.ioc.sprinttestpraktika4;


import com.heyatiminkodlar.ioc.praktika4.action.UserAction;
import com.heyatiminkodlar.ioc.praktika4.user.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 11/17/16.
 */
public class DunyayaSalamTest4 {


    private BeanFactory factory = new ClassPathXmlApplicationContext("ioc/praktika4.xml");

    @Test
    public void testIoc() {
        UserAction ua = factory.getBean("user4Action",UserAction.class);
        User u = new User();
        u.setName("Cavad");
        u.setId(01);
        ua.setUser(u);
        ua.add();

        UserAction ua2 = factory.getBean("user4Action", UserAction.class);
        ua2.add();
    }
}