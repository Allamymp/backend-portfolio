package com.InteractiveMap.interactiveMap.services;

import com.InteractiveMap.interactiveMap.entities.Lesson;
import com.InteractiveMap.interactiveMap.entities.Teacher;
import com.InteractiveMap.interactiveMap.repositories.LessonRepository;
import com.InteractiveMap.interactiveMap.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LessonService {
    @Autowired
    private LessonRepository repository;
    public List<Lesson> findAll(){
        return repository.findAll();
    }
}
