package com.frozendroid.musicplayer.controllers;

import com.frozendroid.musicplayer.dao.UserDao;
import com.frozendroid.musicplayer.dao.UserDaoImpl;
import com.frozendroid.musicplayer.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    final UserDao userDao;

    @Autowired
    public TestController(UserDao userDao) {
        this.userDao = userDao;
    }

    @RequestMapping(value = "/")
    public String index()
    {
        String str = "";
        for (User user : userDao.findAll()) {
            str+=user.getRoles().toArray()[0];
        }
        return str;
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "hi!";
    }

}
