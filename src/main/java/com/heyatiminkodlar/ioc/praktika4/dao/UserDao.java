package com.heyatiminkodlar.ioc.praktika4.dao;

import com.heyatiminkodlar.ioc.praktika4.user.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by root on 11/16/16.
 */
//<bean id="user4Dao" class="com.heyatiminkodlar.ioc.praktika4.dao.UserDao"/>
//Component("user4Dao")
@Repository("user4Dao")
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
