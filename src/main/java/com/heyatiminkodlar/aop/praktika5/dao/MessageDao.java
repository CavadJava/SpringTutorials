package com.heyatiminkodlar.aop.praktika5.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by root on 11/17/16.
 */
//<bean id="messageDao" class="com.heyatiminkodlar.aop.praktika5.dao.MessageDao"/>
@Repository("messageDao")
public class MessageDao implements IMessageDao {

    public void add() {
        System.out.println("msg add from messageDao bean");
    }

    public void delete() {
        System.out.println("msg delete from messageDao bean");
    }

    public void load() {
        System.out.println("msg load from messageDao bean");
    }
}
