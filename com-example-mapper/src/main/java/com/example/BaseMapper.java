package com.example;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

@Component
@NoRepositoryBean
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
