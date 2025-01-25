package com.hang.pojo;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Article {
    private Integer id;
    private String title;
    private String content;
    private String coverImg;
    private String state;//published or draft
    private Integer categoryId;
    private Integer createUser;//creator ID
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
