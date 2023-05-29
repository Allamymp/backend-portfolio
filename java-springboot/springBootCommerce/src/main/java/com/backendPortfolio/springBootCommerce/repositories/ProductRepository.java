package com.backendPortfolio.springBootCommerce.repositories;


import com.backendPortfolio.springBootCommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
