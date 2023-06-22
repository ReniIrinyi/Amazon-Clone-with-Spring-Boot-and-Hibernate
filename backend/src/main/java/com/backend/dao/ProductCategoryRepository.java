package com.backend.dao;

import com.backend.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins="http://localhost:4200")
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
