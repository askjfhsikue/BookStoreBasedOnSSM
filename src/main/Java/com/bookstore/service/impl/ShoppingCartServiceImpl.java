package com.bookstore.service.impl;


import com.bookstore.dao.ShoppingCartDao;
import com.bookstore.model.ShoppingCart;
import com.bookstore.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//注解
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Autowired//自动装配
            ShoppingCartDao shoppingCartDao ;

    @Override//重写方法，调用dao层的相关操作，返回实际需要的数据类型
    public ShoppingCart selectBook(int bookId){
        return  shoppingCartDao.selectBook(bookId);
    }

    @Override
    public boolean addBookToShoppingCart(int id,int bookId,String bookName,int bookNum){
        shoppingCartDao.addBookToShoppingCart(id, bookId, bookName, bookNum);
        ShoppingCart shoppingCart=shoppingCartDao.selectBook(bookId);
        if(shoppingCart==null)
        {
            return false;
        } else
        {
            return  true;
        }
    }

}
