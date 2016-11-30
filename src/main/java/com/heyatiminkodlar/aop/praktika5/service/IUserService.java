package com.heyatiminkodlar.aop.praktika5.service;

import com.heyatiminkodlar.aop.praktika5.user.User;

/**
 * Created by root on 11/16/16.
 */
public interface IUserService {
    public void add(User user);
    public void delete(int id);
    public User load(int id);
}
