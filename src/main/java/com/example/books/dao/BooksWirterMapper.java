package com.example.books.dao;

import com.example.books.model.BooksWirter;

public interface BooksWirterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BooksWirter record);

    int insertSelective(BooksWirter record);

    BooksWirter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BooksWirter record);

    int updateByPrimaryKey(BooksWirter record);
}