package com.heyatiminkodlar.aop.praktika5.dao;

import com.heyatiminkodlar.aop.praktika5.log.Logger;
import com.heyatiminkodlar.aop.praktika5.user.User;
import org.springframework.stereotype.Repository;

/**
 * Created by root on 11/16/16.
 */
//<bean id="user5Dao" class="com.heyatiminkodlar.aop.praktika5.dao.UserDao"/>
//@Component("user5Dao")
@Repository("user5Dao")
public class UserDao implements IUserDao {
    public void add(User user) {
        Logger.info("User add from user5Dao bean");
        System.out.println("Add:"+user);
    }

    public void delete(int id) {
        Logger.info("User delete id from user5Dao bean");
        System.out.println("Delete:"+id);
    }

    public User load(int id) {
        Logger.info("User load from user5Dao bean");
        System.out.println("Load:"+id);
        return null;
    }
}
