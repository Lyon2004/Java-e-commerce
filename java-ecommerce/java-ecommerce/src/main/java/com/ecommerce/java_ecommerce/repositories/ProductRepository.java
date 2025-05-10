package com.ecommerce.java_ecommerce.repositories;

import com.ecommerce.java_ecommerce.model.Category;
import com.ecommerce.java_ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository  extends JpaRepository <Product, Long> {
    List<Product> findByCategoryOrderByPriceAsc(Category category);


    List<Product> findByProductNameLikeIgnoreCase(String keyword);
}
