package com.cybertek.controller;

import com.cybertek.dto.RoleDTO;
import com.cybertek.dto.UserDTO;
import com.cybertek.implementation.RoleServiceImpl;
import com.cybertek.service.RoleService;
import com.cybertek.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    RoleService roleService;
    @Autowired
    UserService userService;

    @GetMapping("/create")
    public String createUser(Model model){

        model.addAttribute("user", new UserDTO());

        model.addAttribute("roles", roleService.findAll());

        model.addAttribute("users", userService.findAll());

        return "/user/create";
    }
}
