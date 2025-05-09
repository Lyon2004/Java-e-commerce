package com.ecommerce.java_ecommerce.service;

import com.ecommerce.java_ecommerce.payload.CategoryDTO;
import com.ecommerce.java_ecommerce.payload.CategoryResponse;

public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNUmber, Integer pageSize, String sortBy, String sortOrder);
    CategoryDTO createCategory(CategoryDTO categoryDTO);

    CategoryDTO deleteCategory(Long categoryId);

    CategoryDTO updateCategory(CategoryDTO categoryDTO, Long categoryId);
}
