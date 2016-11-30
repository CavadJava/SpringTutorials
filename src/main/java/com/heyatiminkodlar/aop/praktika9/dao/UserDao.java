package com.heyatiminkodlar.aop.praktika9.dao;

import com.heyatiminkodlar.aop.praktika9.proxy.Logger;
import com.heyatiminkodlar.aop.praktika9.user.User;
import org.springframework.stereotype.Repository;

/**
 * Created by root on 11/16/16.
 */
//<bean id="user9Dao" class="com.heyatiminkodlar.aop.praktika9.dao.UserDao"/>
//@Component("user9Dao")
@Repository("user9Dao")
public class UserDao implements IUserDao {
    public void add(User user) {
        Logger.info("User add");
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
