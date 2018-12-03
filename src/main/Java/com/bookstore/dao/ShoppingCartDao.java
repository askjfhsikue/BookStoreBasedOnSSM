package com.bookstore.dao;

import com.bookstore.model.ShoppingCart;
import org.apache.ibatis.annotations.Param;

public interface ShoppingCartDao {
    ShoppingCart selectBook(int bookId);
    void addBookToShoppingCart(@Param("id")int id, @Param("bookId")int bookId,@Param("bookName")String bookName, @Param("bookNum")int bookNum);
}
