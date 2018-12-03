package com.bookstore.dao;

import com.bookstore.model.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    List<Book> getBooksByType(String bookType);

}
