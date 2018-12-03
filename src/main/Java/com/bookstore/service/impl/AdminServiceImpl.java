package com.bookstore.service.impl;

import com.bookstore.dao.AdminDao;
import com.bookstore.model.Admin;
import com.bookstore.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service//注解
public class AdminServiceImpl implements AdminService {
    @Autowired//自动装配
    AdminDao adminDao;

    @Override//重写方法，调用dao层的相关操作，返回实际需要的数据类型
    public boolean checkLogin(String username,String password){
        Admin admin = adminDao.selectAdmin(username);
        if (admin.getPassword().equals(password))
            return true;
        else
            return false;
    }
    @Override
    public Admin selectAdminByUsername(String username){
        Admin admin = adminDao.selectAdmin(username);
        return admin;
    }

    @Override
    public boolean register(String username, String password){

        Admin admin = adminDao.selectAdmin(username);
        if(admin==null)
        {
            adminDao.insertAdmin(username, password);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public Admin getAdminById(int id){
        return adminDao.getAdminById(id);
    }

}
