package com.heyatiminkodlar.ioc.sprintestpraktika2;

import com.heyatiminkodlar.ioc.praktika.DunyayaSalam;
import com.heyatiminkodlar.ioc.praktika2.action.UserAction;
import com.heyatiminkodlar.ioc.praktika2.user.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 11/16/16.
 */
public class DunyayaSalamTest2 {

    private BeanFactory factory = new ClassPathXmlApplicationContext("ioc/praktika2.xml");

    @Test
    public void testHello(){
        DunyayaSalam testing = factory.getBean("helloworld",DunyayaSalam.class);
        System.out.println(testing.Salamlar());

        DunyayaSalam testing1 = factory.getBean("helloworld",DunyayaSalam.class);

        System.out.println(testing == testing1);

    }

    @Test
    public void testIoc(){
        UserAction ua = factory.getBean("userAction",UserAction.class);
        User u = new User();
        u.setName("Cavad");
        u.setId(01);
        ua.setUser(u);
        ua.add();

        UserAction ua2 = factory.getBean("userAction",UserAction.class);
        ua2.add();
    }

}
