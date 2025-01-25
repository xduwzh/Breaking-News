package com.hang.mapper;

import com.hang.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where username=#{username}")
    User findByUserName(String username);

    //add new user
    @Insert("insert into user(username,password,create_time,update_time) values(#{username},#{password},now(),now())")
    int add(@Param("username") String username, @Param("password") String password);
}
