package com.InteractiveMap.interactiveMap.services;

import com.InteractiveMap.interactiveMap.entities.Teacher;
import com.InteractiveMap.interactiveMap.entities.User;
import com.InteractiveMap.interactiveMap.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository repository;
    public List<Teacher> findAll(){
        return repository.findAll();
    }
}
