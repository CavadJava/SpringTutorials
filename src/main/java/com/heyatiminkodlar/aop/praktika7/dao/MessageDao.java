package com.heyatiminkodlar.aop.praktika7.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by root on 11/17/16.
 */
@Repository("message7Dao")
public class MessageDao implements IMessageDao {

    public void add() {
        System.out.println("msg add");
    }

    public void delete() {
        System.out.println("msg delete");
    }

    public void load() {
        System.out.println("msg load");
    }
}
