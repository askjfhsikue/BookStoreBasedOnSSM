package com.bookstore.controller;


import com.bookstore.model.Book;
import com.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService BookService;


    @RequestMapping(value = "/getBooksByType", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody//响应体  用于向前端返回数据
    public Map<String,Object> getBooksByType(@RequestBody/*请求体。用于接收前端传来的数据*/ Map<String,Object> map, HttpServletRequest request){

        Map<String,Object> ResponseMap = new HashMap<>();
        try {
            List<Book> bookList=BookService.getBooksByType((String)map.get("bookType"));
            if(bookList.isEmpty()) {
                ResponseMap.put("state",false);
                ResponseMap.put("message","没有该类型书籍。");
                ResponseMap.put("data",bookList);
            }else{
                ResponseMap.put("state",true);
                ResponseMap.put("message","查询成功。");
                ResponseMap.put("data",bookList);
            }
        }catch (Exception e){
            System.out.println("error");
            System.out.println(e.getMessage());

        }
        return ResponseMap;//返回给前端的数据
    }

}
