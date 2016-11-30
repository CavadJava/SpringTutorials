package com.heyatiminkodlar.ioc.sprintestpraktika;

import com.heyatiminkodlar.ioc.praktika.DunyayaSalam;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by root on 11/16/16.
 */
public class DunyayaSalamTest {

    private BeanFactory factory = new ClassPathXmlApplicationContext("ioc/praktika.xml");

    @Test
    public void testHello(){
        DunyayaSalam testing = factory.getBean("helloworld",DunyayaSalam.class);
        System.out.println(testing.Salamlar());
    }

}
