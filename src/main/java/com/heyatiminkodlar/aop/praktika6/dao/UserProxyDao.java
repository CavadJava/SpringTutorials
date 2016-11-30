package com.heyatiminkodlar.aop.praktika6.dao;

import com.heyatiminkodlar.aop.praktika6.proxy.Logger;
import com.heyatiminkodlar.aop.praktika6.user.User;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by root on 11/17/16.
 */
@Component("userProxy6Dao")
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
        Logger.info("User add from userProxy6Dao bean");
        userDao.add(user);
    }

    public void delete(int id) {
        Logger.info("User delete from userProxy6Dao bean");
        userDao.delete(id);
    }

    public User load(int id) {
        Logger.info("User load from userProxy6Dao bean");
        return userDao.load(id);
    }
}
