package com.example.controller;

//import com.example.mapper.UserInfoMapper;
//import com.example.model.UserInfo;
import com.example.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test2")
@Service
public class DemoController {
    @GetMapping("/index")
    public String index()
    {
        return "6666666666";
    }

    @Autowired private UserService userService;

    @GetMapping("/sql")
    public String testSql()
    {
        return userService.test();
    }
}
