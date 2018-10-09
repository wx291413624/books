package com.example.books.dao;

import com.example.books.model.BooksCategory;

public interface BooksCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BooksCategory record);

    int insertSelective(BooksCategory record);

    BooksCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BooksCategory record);

    int updateByPrimaryKey(BooksCategory record);
}