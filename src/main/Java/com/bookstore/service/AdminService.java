package com.bookstore.service;

import com.bookstore.model.Admin;

//根据实际需要编写相关操作的接口，接口重写在impl包下面
public interface AdminService {

    boolean checkLogin(String username, String password);
    Admin selectAdminByUsername(String username);
    boolean register(String username, String password);
    Admin getAdminById(int id);
}
