package com.backendPortfolio.springBootCommerce.repositories;

import com.backendPortfolio.springBootCommerce.entities.Order;
import com.backendPortfolio.springBootCommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
