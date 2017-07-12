package com.aswl.teemo.controller;

import com.aswl.teemo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by miaorf on 2016/6/19.
 */
@Controller
@RequestMapping("/user")
public class HelloController {
    @RequestMapping("/{id}")
    public User view(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("zhang");
        return user;
    }
    @RequestMapping(value ="/index")
    public String index(Model model){
        model.addAttribute("name","Ryan");
        return "index";
    }
}