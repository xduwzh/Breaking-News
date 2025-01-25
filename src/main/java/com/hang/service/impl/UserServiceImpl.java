package com.hang.service.impl;

import com.hang.mapper.UserMapper;
import com.hang.pojo.User;
import com.hang.service.UserService;
import com.hang.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByUserName(String username) {
        User u = userMapper.findByUserName(username);
        return u;
    }

    @Override
    public void register(String username, String password) {
        //encrypt password
        String md5String = Md5Util.getMD5String(password);
        userMapper.add(username, md5String);
    }
}
