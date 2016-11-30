package com.heyatiminkodlar.aop.praktika5.service;

import com.heyatiminkodlar.aop.praktika5.dao.IUserDao;
import com.heyatiminkodlar.aop.praktika5.user.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by root on 11/16/16.
 */
//<bean id="user5Service" class="com.heyatiminkodlar.aop.praktika5.service.UserService"/>
//@Component("user5Service")
@Service("user5Service")
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

    //JSR330, @Inject
    @Resource(name = "userProxyDao")
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
