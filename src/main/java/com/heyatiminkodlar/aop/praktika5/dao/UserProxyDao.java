package com.heyatiminkodlar.aop.praktika5.dao;

import com.heyatiminkodlar.aop.praktika5.log.Logger;
import com.heyatiminkodlar.aop.praktika5.user.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by root on 11/17/16.
 */
@Component("userProxyDao")
public class UserProxyDao implements IUserDao{
    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    @Resource
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    public void add(User user) {
        Logger.info("User add from userProxyDao bean");
        userDao.add(user);
    }

    public void delete(int id) {
        Logger.info("User delete from userProxyDao bean");
        userDao.delete(id);
    }

    public User load(int id) {
        Logger.info("User load from userProxyDao bean");
        return userDao.load(id);
    }
}
