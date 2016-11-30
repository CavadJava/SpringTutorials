package com.heyatiminkodlar.aop.praktika8.service;

import com.heyatiminkodlar.aop.praktika8.dao.IMessageDao;
import com.heyatiminkodlar.aop.praktika8.dao.IUserDao;
import com.heyatiminkodlar.aop.praktika8.user.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by root on 11/16/16.
 */
//<bean id="user8Service" class="com.heyatiminkodlar.aop.praktika8.service.UserService"/>
//@Component("user8Service")
@Service("user8Service")
public class UserService implements IUserService {
    private IUserDao userDao;
    private IMessageDao messageDao;

    public IMessageDao getMessageDao() {
        return messageDao;
    }

    @Resource(name = "message8Dao")
    public void setMessageDao(IMessageDao messageDao) {
        this.messageDao = messageDao;
    }

    public void add(User user) {
        messageDao.add();
        messageDao.delete();
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
    @Resource(name = "user8Dao")
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
