package com.bookstore.controller.viewController;

import com.bookstore.model.Book;
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
@RequestMapping("/adminPage")
public class adminViewController {
    @Autowired
    BookService bookService;

    @RequestMapping(
            value="/",
            method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8"
    )
    @ResponseBody
    public ModelAndView getMainPage(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        List<Book> books = bookService.getBooksByType("文学");

        mv.addObject("book",books.get(0));
        mv.setViewName("admin-index");
        return mv;
    }

    @RequestMapping(
            value="/getAllPrders",
            method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8"
    )
    @ResponseBody
    public ModelAndView getAllPrders(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("admin-showOrders");
        return mv;
    }

    @RequestMapping(
            value="/addBook",
            method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8"
    )
    @ResponseBody
    public ModelAndView addBook(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("admin-addBook");
        return mv;
    }

    @RequestMapping(
            value="/chargeUser",
            method = RequestMethod.GET,
            produces = "application/json;charset=UTF-8"
    )
    @ResponseBody
    public ModelAndView chargeUser(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("admin-chargeUser");
        return mv;
    }

}
