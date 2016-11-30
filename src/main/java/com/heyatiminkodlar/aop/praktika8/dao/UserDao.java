package com.heyatiminkodlar.aop.praktika8.dao;

import com.heyatiminkodlar.aop.praktika8.proxy.Logger;
import com.heyatiminkodlar.aop.praktika8.user.User;
import org.springframework.stereotype.Repository;

/**
 * Created by root on 11/16/16.
 */
//<bean id="user8Dao" class="com.heyatiminkodlar.aop.praktika8.dao.UserDao"/>
//@Component("user8Dao")
@Repository("user8Dao")
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
