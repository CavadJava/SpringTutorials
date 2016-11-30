package com.heyatiminkodlar.ioc.praktika2.action;

import com.heyatiminkodlar.ioc.praktika2.service.IUserService;
import com.heyatiminkodlar.ioc.praktika2.user.User;

/**
 * Created by root on 11/16/16.
 */
public class UserAction {
    private User user;
    private IUserService userService;
    private int id;

    public void add(){
        userService.add(user);
    }
    public void delete(){
        userService.delete(id);
    }
    public void load(){
        userService.load(id);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
}
