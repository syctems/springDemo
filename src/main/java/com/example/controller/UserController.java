package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @GetMapping("/getList")
    public String  userController(Model model)
    {
        List<User> userList = userService.getUserList();
        model.addAttribute("userList",userList);
        return "index";
    }

    @GetMapping("/getOther")
    public String userGetOther()
    {
        return "Others/other";
    }
}
