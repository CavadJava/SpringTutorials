package com.heyatiminkodlar.aop.praktika7.service;

import com.heyatiminkodlar.aop.praktika7.user.User;

/**
 * Created by root on 11/16/16.
 */
public interface IUserService {
    public void add(User user);
    public void delete(int id);
    public User load(int id);
}
