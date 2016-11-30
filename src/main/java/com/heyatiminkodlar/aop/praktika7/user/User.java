package com.heyatiminkodlar.aop.praktika7.user;

import org.springframework.stereotype.Component;

/**
 * Created by root on 11/16/16.
 */
//<bean id="user7" class="com.heyatiminkodlar.aop.praktika7.service.User"/>
@Component("user7")
public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
