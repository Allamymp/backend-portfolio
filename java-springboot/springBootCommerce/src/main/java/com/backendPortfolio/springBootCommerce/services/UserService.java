package com.backendPortfolio.springBootCommerce.services;

import com.backendPortfolio.springBootCommerce.entities.User;
import com.backendPortfolio.springBootCommerce.repositories.UserRepository;
import com.backendPortfolio.springBootCommerce.services.exceptions.ResourceNotFindException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    public List<User> findAll(){
        return repository.findAll();
    }
    public User findById(Long id){
        Optional<User> obj =  repository.findById(id);
        return obj.orElseThrow(()->new ResourceNotFindException(id));
    }
    public User insert(User obj){
        return repository.save(obj);
    }
    public void delete(Long id){
        repository.deleteById(id);
    }
    public  User update(Long id, User obj){
        User entity = repository.getReferenceById(id);
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setNome(obj.getNome());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
