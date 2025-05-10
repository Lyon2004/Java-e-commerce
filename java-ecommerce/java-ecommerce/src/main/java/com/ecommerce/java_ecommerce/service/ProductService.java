package com.ecommerce.java_ecommerce.service;

import com.ecommerce.java_ecommerce.payload.ProductDTO;
import com.ecommerce.java_ecommerce.payload.ProductResponse;

public interface ProductService {
    ProductDTO addProduct(Long categoryId, ProductDTO product);

    ProductResponse getAllProducts();

    ProductResponse searchByCategory(Long categoryId);

    ProductResponse searchProductByKeyword(String keyword);

    ProductDTO deleteProduct(Long productId);
}

