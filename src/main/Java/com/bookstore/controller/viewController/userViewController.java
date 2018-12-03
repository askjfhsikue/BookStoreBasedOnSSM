package com.bookstore.controller.viewController;

import com.bookstore.model.Admin;
import com.bookstore.model.Book;
import com.bookstore.service.AdminService;
import com.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class userViewController {

    @Autowired
    BookService bookService;
    @Autowired
    AdminService adminService;


    @RequestMapping(
            value="/",
            method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8"
    )
    @ResponseBody
    public ModelAndView getMainPage(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        HttpSession session =request.getSession(true);

        List<Book> books = bookService.getBooksByType("教材");

        int id =  (Integer) session.getAttribute("id");
        Admin user = adminService.getAdminById(id);

        mv.addObject("book",books.get(0));
        mv.addObject("username",user.getUsername());

        mv.setViewName("user-index");
        return mv;
    }


}
