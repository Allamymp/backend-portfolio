package com.InteractiveMap.interactiveMap.repositories;

import com.InteractiveMap.interactiveMap.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
