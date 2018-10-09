package com.example.books.dao;


import com.example.books.model.BooksBorrowLog;


public interface BooksBorrowLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BooksBorrowLog record);

    int insertSelective(BooksBorrowLog record);

    BooksBorrowLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BooksBorrowLog record);

    int updateByPrimaryKey(BooksBorrowLog record);
}