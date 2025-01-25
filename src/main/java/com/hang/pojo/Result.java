package com.hang.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {
    private Integer code; //state code  0-success  1-fail
    private String message; //hint
    private T data; //result data

    //Successful result with data
    public static <E> Result<E> success(E data) {
        return new Result<>(0, "Success", data);
    }

    //Result without data
    public static Result success() {
        return new Result(0, "Success", null);
    }

    public static Result error(String message) {
        return new Result(1, message, null);
    }
}
