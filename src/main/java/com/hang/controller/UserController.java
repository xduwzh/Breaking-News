package com.hang.controller;


import com.hang.pojo.Result;
import com.hang.pojo.User;
import com.hang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public Result register(String username, String password) {
        //Search existing usernames
        User u = userService.findByUserName(username);
        if (u == null) {
            //username not occupied
            //register
            userService.register(username, password);
            return Result.success();
        }else{
            //username occupied
            return Result.error("Username Occupied");
        }
    }
}
