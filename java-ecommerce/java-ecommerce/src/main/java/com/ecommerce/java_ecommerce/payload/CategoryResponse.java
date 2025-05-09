package com.ecommerce.java_ecommerce.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryResponse {
    private List<CategoryDTO> content;
    private Integer pageSize;
    private Integer pageNumbers;
    private Integer totalPages;
    private Long totalElements;
    private boolean lastPage;
}
