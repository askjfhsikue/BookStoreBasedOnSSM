package com.bookstore.service.impl;

import com.bookstore.dao.BookDao;
import com.bookstore.model.Book;
import com.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//注解
public class BookServiceImpl implements BookService{
    @Autowired//自动装配
    BookDao BookDao;

    @Override
    public  List<Book> getBooksByType(String bookType){
        List<Book> bookList=BookDao.getBooksByType(bookType);
        return  bookList;
    }


}
