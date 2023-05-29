package com.backendPortfolio.springBootCommerce.services;

import com.backendPortfolio.springBootCommerce.entities.Category;
import com.backendPortfolio.springBootCommerce.repositories.CategoryRepository;
import com.backendPortfolio.springBootCommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;
    public List<Category> findAll(){
        return repository.findAll();
    }
    public Category findById(Long id){
        Optional<Category> obj =  repository.findById(id);
        return obj.get();
    }
}
