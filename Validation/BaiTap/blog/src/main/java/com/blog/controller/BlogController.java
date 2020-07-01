package com.blog.controller;

import com.blog.model.Blog;
import com.blog.model.Category;
import com.blog.service.impl.BlogServiceImpl;
import com.blog.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.List;

@RequestMapping("blog")
@Controller
public class BlogController  {
    @Autowired
    private BlogServiceImpl blogServiceImpl;

    @Autowired
    private CategoryServiceImpl categoryServiceImpl;

    @GetMapping("")
    public ModelAndView showBlog(){
        List<Blog> blogs = blogServiceImpl.getAllBlog();
        return new ModelAndView("blog/list","blog",blogs);
    }

    @GetMapping("/create-blog")
    public ModelAndView showFromCreate(){
        ModelAndView modelAndView = new ModelAndView("blog/create","blog",new Blog());
        List<Category> categories = categoryServiceImpl.findAll();
        modelAndView.addObject("categories",categories);
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public String createBlog(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes){
        redirectAttributes.addFlashAttribute("message","Create successfully !!");
        blog.setDate(new Date());
        try {
            blogServiceImpl.saveBlog(blog);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return "redirect:";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showBlogEdit(@PathVariable Long id){
        return new ModelAndView();
    }
}
