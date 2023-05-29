package com.backendPortfolio.springBootCommerce.repositories;

import com.backendPortfolio.springBootCommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
