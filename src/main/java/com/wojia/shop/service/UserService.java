package com.wojia.shop.service;

import com.wojia.shop.pojo.User;
import org.apache.ibatis.annotations.Insert;

public interface UserService {
    //添加用户
    int ins(User user);

    User selectByUsernameAndpassword(String username, String password);
    User  selectByUsername(String username);

}
