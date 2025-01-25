package com.hang.pojo;



import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String email;
    private String userPic;//user profile pic addr
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
