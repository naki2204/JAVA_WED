package com.blog.service;

import com.blog.model.Blog;

import java.util.List;

public interface BlogService  {
    List<Blog> getAllBlog();

    void saveBlog(Blog blog);
}
