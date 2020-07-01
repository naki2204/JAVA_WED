package com.validate_form.controller;


import com.validate_form.model.User;
import com.validate_form.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ModelAndView displayUser(){
        List <User> users = userService.getAllUser();
        return new ModelAndView("index","users",users);
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView=new ModelAndView("create");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }

    @PostMapping("/create-user")
    public String createUser(@Validated @ModelAttribute("user")User user , BindingResult bindingResult, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Create successfully!!!");
        if(bindingResult.hasErrors()){
            return "create";
        }
        try {
            userService.saveUser(user);
        }catch (Exception e
        ){

            e.getMessage();
        }

        return "redirect:/";
    }
}
