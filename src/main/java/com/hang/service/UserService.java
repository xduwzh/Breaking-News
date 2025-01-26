package com.hang.service;

import com.hang.pojo.User;

public interface UserService {
    //search database by username
    User findByUserName(String username);

    //register new user
    void register(String username, String password);


    //update user info
    void update(User user);

    //update avatar url
    void updateAvatar(String avatarUrl);

    void updatePwd(String newPwd);
}
