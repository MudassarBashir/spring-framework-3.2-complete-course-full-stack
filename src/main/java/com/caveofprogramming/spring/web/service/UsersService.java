package com.caveofprogramming.spring.web.service;

import com.caveofprogramming.spring.web.dao.User;
import com.caveofprogramming.spring.web.dao.UsersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Moe B. on 11/16/2016.
 */
@Service("usersService")
public class UsersService {

    @Autowired
    private UsersDao usersDao;

    public void create(User user) {
        usersDao.create(user);
    }
}
