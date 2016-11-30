package com.heyatiminkodlar.aop.praktika7.dao;

import com.heyatiminkodlar.aop.praktika7.proxy.Logger;
import com.heyatiminkodlar.aop.praktika7.user.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by root on 11/17/16.
 */
@Component("userProxy7Dao")
public class UserProxyDao implements IUserDao {
    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    @Resource
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public void add(User user) {
        Logger.info("User add");
        userDao.add(user);
    }

    public void delete(int id) {
        Logger.info("User deleteById");
        userDao.delete(id);
    }

    public User load(int id) {
        return userDao.load(id);
    }
}
