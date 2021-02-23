package com.wojia.shop.controller;

import com.wojia.shop.pojo.User;
import com.wojia.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 庞庞
 * @version 1.0
 * @description: TODO
 * @date 2021/2/22 9:14
 */
@Controller
public class RegistController {
    @Autowired
    UserService us;
    //跳转到注册页面
    @RequestMapping("/toregist")
    public String toregist() {
        return "会员注册";
    }
    //注册用户
    @RequestMapping("/add")
    public String add(User user){
        us.ins(user);
        return "redirect:/tologin";
    }
    //查询用户名是否存在
    @RequestMapping("/sbn")
    @ResponseBody
    public boolean sbn(String username){
        User user = us.selectByUsername(username);
        System.out.println(user);
        if (user==null){
            //可用
            return true;
        }else {
            return false;
        }

    }
}
