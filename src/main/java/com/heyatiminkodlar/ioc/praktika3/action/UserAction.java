package com.heyatiminkodlar.ioc.praktika3.action;

import com.heyatiminkodlar.ioc.praktika3.user.User;
import com.heyatiminkodlar.ioc.praktika3.service.IUserService;

import java.util.List;

/**
 * Created by root on 11/16/16.
 */
public class UserAction {
    private User user;
    private IUserService userService;
    private int id;
    private List<String> names;

    public UserAction(){

    }

    //scenario-2 property with constructor
    public UserAction(IUserService iUserService){
        super();
        userService = iUserService;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public void add(){
        System.out.println(id);
        System.out.println(names);
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
