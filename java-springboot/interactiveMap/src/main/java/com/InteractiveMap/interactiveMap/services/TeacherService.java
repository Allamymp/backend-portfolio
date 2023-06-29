package com.InteractiveMap.interactiveMap.services;

import com.InteractiveMap.interactiveMap.entities.Teacher;
import com.InteractiveMap.interactiveMap.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository repository;

    public List<Teacher> findAll() {
        return repository.findAll();
    }

    public Teacher findById(Long id) {
        Optional<Teacher> obj = repository.findById(id);
        return obj.orElse(null);
    }

    public Teacher insert(Teacher obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Teacher update(Long id, Teacher obj) {
        Teacher entity = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid teacher ID: " + id));
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(Teacher entity, Teacher obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setSpecialLocation(obj.getSpecialLocation());

        if (obj.getSpecialLocation()) {
            entity.setLocation(obj.getLocation());
        }
    }
}
