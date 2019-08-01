package com.dls.service.impl;

import com.dls.dao.UserDao;
import com.dls.domain.User;
import com.dls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public User getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }

    @Transactional
    public int addUser(String username, String password) {
        return addUser(username,password);
    }
}
