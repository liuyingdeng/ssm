package com.dls.service;

import com.dls.domain.User;

public interface UserService {
    public User getUserByUsername(String username);
    public int addUser(String username,String password);
}
