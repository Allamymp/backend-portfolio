package com.backendPortfolio.springBootCommerce.repositories;

import com.backendPortfolio.springBootCommerce.entities.OrderItem;
import com.backendPortfolio.springBootCommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
