package com.example.books;

import com.example.books.dao.UserMapper;
import com.example.books.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BooksApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println("user = " + user);
    }

}
