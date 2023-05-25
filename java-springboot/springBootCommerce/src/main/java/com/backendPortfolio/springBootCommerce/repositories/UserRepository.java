package com.backendPortfolio.springBootCommerce.repositories;

import com.backendPortfolio.springBootCommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
