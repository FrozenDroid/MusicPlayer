package com.frozendroid.musicplayer.dao;

import com.frozendroid.musicplayer.entities.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();
    User findByEmail(String email);

}
