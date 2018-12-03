package com.bookstore.service;

import com.bookstore.model.ShoppingCart;


public interface ShoppingCartService {
    ShoppingCart selectBook(int bookId);
    boolean addBookToShoppingCart(int id,int bookId,String bookName,int bookNum);
}
