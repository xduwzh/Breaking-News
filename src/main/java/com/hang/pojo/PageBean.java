package com.hang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean <T>{
    private Long total;//num of items
    private List<T> items;//list of items(articles)
}
