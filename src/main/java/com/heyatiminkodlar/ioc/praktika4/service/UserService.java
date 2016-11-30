package com.heyatiminkodlar.ioc.praktika4.service;

import com.heyatiminkodlar.ioc.praktika4.dao.IUserDao;
import com.heyatiminkodlar.ioc.praktika4.user.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by root on 11/16/16.
 */
//<bean id="user4Service" class="com.heyatiminkodlar.ioc.praktika4.service.UserService"/>
//@Component("user4Service")
@Service("user4Service")
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

    @Resource
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
