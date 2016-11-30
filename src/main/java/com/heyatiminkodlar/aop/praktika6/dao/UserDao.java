package com.heyatiminkodlar.aop.praktika6.dao;

import com.heyatiminkodlar.aop.praktika6.proxy.Logger;
import com.heyatiminkodlar.aop.praktika6.user.User;
import org.springframework.stereotype.Repository;

/**
 * Created by root on 11/16/16.
 */
//<bean id="user6Dao" class="com.heyatiminkodlar.aop.praktika6.dao.UserDao"/>
//@Component("user6Dao")
@Repository("user6Dao")
public class UserDao implements IUserDao {
    public void add(User user) {
        Logger.info("User add from user6Dao bean");
        System.out.println("Add:"+user);
    }

    public void delete(int id) {
        Logger.info("User delete from user6Dao bean");
        System.out.println("Delete:"+id);
    }

    public User load(int id) {
        Logger.info("User load from user6Dao bean");
        System.out.println("Load:"+id);
        return null;
    }
}
