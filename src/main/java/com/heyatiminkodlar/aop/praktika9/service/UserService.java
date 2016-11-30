package com.heyatiminkodlar.aop.praktika9.service;

import com.heyatiminkodlar.aop.praktika9.dao.IMessageDao;
import com.heyatiminkodlar.aop.praktika9.dao.IUserDao;
import com.heyatiminkodlar.aop.praktika9.user.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by root on 11/16/16.
 */
//<bean id="user9Service" class="com.heyatiminkodlar.aop.praktika9.service.UserService"/>
//@Component("user9Service")
@Service("user9Service")
public class UserService implements IUserService {
    private IUserDao userDao;
    private IMessageDao messageDao;

    public IMessageDao getMessageDao() {
        return messageDao;
    }

    @Resource(name = "message9Dao")
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
    @Resource(name = "user9Dao")
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
