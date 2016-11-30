package com.heyatiminkodlar.aop.praktika8.dao;

import com.heyatiminkodlar.aop.praktika8.user.LogInfo;

/**
 * Created by root on 11/17/16.
 */
public interface IMessageDao {
    @LogInfo("Message Add by IMessageDao")
    public void add();
    public void delete();
    public void load();
}
