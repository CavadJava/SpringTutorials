package com.heyatiminkodlar.aop.praktika7.dao;

import com.heyatiminkodlar.aop.praktika7.proxy.Logger;
import com.heyatiminkodlar.aop.praktika7.user.User;
import org.springframework.stereotype.Repository;

/**
 * Created by root on 11/16/16.
 */
//<bean id="user7Dao" class="com.heyatiminkodlar.aop.praktika7.dao.UserDao"/>
//@Component("user7Dao")
@Repository("user7Dao")
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
