package com.heyatiminkodlar.ioc.praktika3.service;

import com.heyatiminkodlar.ioc.praktika3.dao.IUserDao;
import com.heyatiminkodlar.ioc.praktika3.user.User;

/**
 * Created by root on 11/16/16.
 */
public class UserService implements IUserService {
    private IUserDao userDao;
    public void add(User user) {
        userDao.add(user);
    }

    public void delete(int id) {
        userDao.delete(id);
    }

    public User load(int id) {
        return userDao.load(id);
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
