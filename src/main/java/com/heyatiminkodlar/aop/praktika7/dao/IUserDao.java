package com.heyatiminkodlar.aop.praktika7.dao;

import com.heyatiminkodlar.aop.praktika7.user.LogInfo;
import com.heyatiminkodlar.aop.praktika7.user.User;

/**
 * Created by root on 11/16/16.
 */
public interface IUserDao {
    @LogInfo("User add by IUserDao")
    public void add(User user);
    @LogInfo("User delete by IUserDao")
    public void delete(int id);
    public User load(int id);
}
