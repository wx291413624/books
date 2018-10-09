package com.example.books.service;

import com.example.books.dao.BooksMapper;
import com.example.books.model.Books;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Author: 夜凉如水般清澈
 * 18-10-9 上午9:52
 * Fear can hold you prisoner, hope can set you free. A strong man can save himself
 */
@Service
public class BooksService {

    @Autowired
    private BooksMapper booksMapper;

    public Object findAll(Integer page, Integer num) {
        PageHelper.startPage(Optional.ofNullable(page).orElse(1), Optional.ofNullable(num).orElse(10));
        List<Books> all = booksMapper.findAll();
        PageInfo pageInfo = new PageInfo(all);
        return pageInfo;
    }
}
