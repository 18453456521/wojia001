package com.wojia.shop.controller;

import com.wojia.shop.mapper.UserMapper;
import com.wojia.shop.pojo.User;
import com.wojia.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 庞庞
 * @version 1.0
 * @description: TODO
 * @date 2021/2/22 9:01
 */
@Controller
public class LoginController {
    @Autowired
    UserService us;
    @Autowired
    UserMapper um;

    //跳转到登录页面
    @RequestMapping("/tologin")
    public String tologin() {
        return "会员登录";
    }

    //登录页面
    @RequestMapping("/login")
    public String login(Model model, HttpSession session) {
        session.setAttribute("ses", "ses");
        return "index";
    }

    //登陆验证
    @RequestMapping("/loginexist")
    public String loginexist(Model model) {
        User user = um.selectByUsernameAndpassword("username", "password");
        if (user == null) {
            //查询为空
            model.addAttribute("msg", "账号或密码错误");
            return "会员登陆";
        } else {
            return "index";
        }

    }


}
