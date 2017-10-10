package com.ldcr.rwdb.dao;


import com.ldcr.rwdb.entity.User;

public interface UserMapper {
    User selectByPrimaryKey(Integer id);

    int insert(User record);

    int updateByPrimaryKey(User record);
}
