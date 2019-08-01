package com.dls.dao;

import com.dls.domain.User;

public interface UserDao {
    public User getUserByUsername(String username);
    public int addUser(String username,String password);
}
