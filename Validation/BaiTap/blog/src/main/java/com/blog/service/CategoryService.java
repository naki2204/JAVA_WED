package com.blog.service;

import com.blog.model.Category;
import com.blog.repository.CategoryRepository;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
}
