package com.controller;

import com.entity.UserEntity;
import com.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


/**
 * Created by Enzo Cotter on 2019/5/11.
 */
@Controller
@RequestMapping("login")
public class LoginController {
    @Resource
    UserServiceImpl userService;
     @RequestMapping("login")
    public String login(Model model, @RequestParam("username") String name, String password, HttpSession session){
         UserEntity user = userService.login(name, password);
         if (user!=null){
           session.setAttribute("user",user);
             return "index";
         }
         return  "login";
    }

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }
}
