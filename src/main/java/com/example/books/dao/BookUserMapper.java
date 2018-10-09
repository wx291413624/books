package com.example.books.dao;

import com.example.books.model.BookUser;

public interface BookUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookUser record);

    int insertSelective(BookUser record);

    BookUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookUser record);

    int updateByPrimaryKey(BookUser record);
}