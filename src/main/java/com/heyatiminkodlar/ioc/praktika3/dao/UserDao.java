package com.heyatiminkodlar.ioc.praktika3.dao;

import com.heyatiminkodlar.ioc.praktika3.user.User;

/**
 * Created by root on 11/16/16.
 */
public class UserDao implements IUserDao {
    public void add(User user) {
        System.out.println("Add:"+user);
    }

    public void delete(int id) {
        System.out.println("Delete:"+id);
    }

    public User load(int id) {
        System.out.println("Load:"+id);
        return null;
    }
}
