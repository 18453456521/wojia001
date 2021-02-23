package com.wojia.shop.service.impl;

import com.wojia.shop.mapper.UserMapper;
import com.wojia.shop.pojo.User;
import com.wojia.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 庞庞
 * @version 1.0
 * @description: TODO
 * @date 2021/2/3 15:26
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper um;
    @Override
    public int ins(User user) {
        return um.ins(user);
    }

    @Override
    public User selectByUsernameAndpassword(String username, String password) {
        return um.selectByUsernameAndpassword(username,password);
    }

    @Override
    public User selectByUsername(String username) {

        return um.selectByUsername(username);
    }
}
