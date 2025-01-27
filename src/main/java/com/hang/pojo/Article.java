package com.hang.pojo;


import com.hang.anno.State;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDateTime;

@Data
public class Article {
    private Integer id;

    @NotEmpty
    @Pattern(regexp = "^\\S{1,10}$")
    private String title;

    @NotEmpty
    private String content;

    @NotEmpty
    @URL
    private String coverImg;

    @State
    private String state;//published or draft

    @NotNull
    private Integer categoryId;
    private Integer createUser;//creator ID
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
