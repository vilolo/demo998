package com.example.service;

import com.example.mapper.UserInfoMapper;
import com.example.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class UserService extends DaoImpl {
    @Autowired private UserInfoMapper userInfoMapper;

    public String test()
    {
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(1);
        return userInfo.getNickname();
    }
}
