package com.wojia.shop.controller;

import com.wojia.shop.pojo.User;
import com.wojia.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 庞庞
 * @version 1.0
 * @description: TODO
 * @date 2021/2/3 15:22
 */
@Controller
public class UserController {

    //展示首页面
    @RequestMapping("/show")
    public String loginsuccess(){
        return "index";
    }

}
