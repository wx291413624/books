package com.example.books.controller;

import com.example.books.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 夜凉如水般清澈
 * 18-10-9 上午9:51
 * Fear can hold you prisoner, hope can set you free. A strong man can save himself
 */
@RestController
@RequestMapping(value = "book")
public class BooksController {

    @Autowired
    private BooksService booksService;

    @RequestMapping(value = "list")
    public Object findAll(Integer page, Integer num) {
        return booksService.findAll(page, num);
    }
}
