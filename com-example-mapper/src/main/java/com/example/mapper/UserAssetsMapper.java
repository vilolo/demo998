package com.example.mapper;

import com.example.BaseMapper;
import com.example.model.UserAssets;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAssetsMapper extends BaseMapper<UserAssets> {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAssets record);

    int insertSelective(UserAssets record);

    UserAssets selectByPrimaryKey2(Integer id);

    int updateByPrimaryKeySelective(UserAssets record);

    int updateByPrimaryKey(UserAssets record);
}