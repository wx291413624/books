package com.example.books.dao;

import com.example.books.model.Books;

import java.util.List;

public interface BooksMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Books record);

    int insertSelective(Books record);

    Books selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Books record);

    int updateByPrimaryKey(Books record);

    List<Books> findAll();
}