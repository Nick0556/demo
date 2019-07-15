package com.mapper;

import com.domain.Pgb;

public interface PgbMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pgb record);

    int insertSelective(Pgb record);

    Pgb selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pgb record);

    int updateByPrimaryKey(Pgb record);
}