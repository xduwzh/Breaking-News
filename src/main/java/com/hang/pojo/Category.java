package com.hang.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Category {
    private Integer id;
    private String categoryName;
    private String categoryAlias;
    private Integer createUser;//creator id
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
