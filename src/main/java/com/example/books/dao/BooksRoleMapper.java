package com.example.books.dao;

import com.example.books.model.BooksRole;

public interface BooksRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BooksRole record);

    int insertSelective(BooksRole record);

    BooksRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BooksRole record);

    int updateByPrimaryKey(BooksRole record);
}