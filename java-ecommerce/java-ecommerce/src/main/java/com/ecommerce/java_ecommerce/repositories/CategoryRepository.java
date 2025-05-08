package com.ecommerce.java_ecommerce.repositories;

import com.ecommerce.java_ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
