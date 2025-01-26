package com.hang.controller;

import com.hang.pojo.Result;
import com.hang.utils.JwtUtil;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @GetMapping("/list")
    public Result<String> list(/*@RequestHeader(name = "Authorization") String token,
                               HttpServletResponse response*/) {
        //verify token
//        try {
//            Map<String, Object> claims = JwtUtil.parseToken(token);
//            return Result.success("article data");
//        } catch (Exception e) {
//            //set http response 401
//            response.setStatus(401);
//            return Result.error("Not login");
//        }
        return Result.success("article data");
    }
}
