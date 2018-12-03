package com.bookstore.dao;

import com.bookstore.model.Admin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//dao层放置对数据 库的相关操作
public interface AdminDao {
    Admin selectAdmin(String username);//根据用户名查询用户，返回用户对象。对这个操作的具体实现在下面mapper包的AdminMapper.xml文件里面
    void insertAdmin(@Param("username")String username,@Param("password")String password);
    Admin getAdminById(int id);
}
