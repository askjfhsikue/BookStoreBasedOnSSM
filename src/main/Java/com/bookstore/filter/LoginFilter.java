package com.bookstore.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
//登陆拦截器
@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest request =  (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();

        String requestURL = request.getRequestURI();
        String Path = request.getContextPath();
        String FinalRequestURL = requestURL.substring(Path.length());

        if (null == session.getAttribute("id")){
            if(requestURL.equals("/admin/checkLogin") || requestURL.equals("/")){
                chain.doFilter(req, resp);
            }else {
                System.out.println("未登录访问" + requestURL);
                System.out.println("拦截");
                response.sendRedirect("/");
                return;
            }
        }else {
            chain.doFilter(req, resp);
        }
        return;
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
