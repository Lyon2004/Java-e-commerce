package com.ecommerce.java_ecommerce.service;

import com.ecommerce.java_ecommerce.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
}
