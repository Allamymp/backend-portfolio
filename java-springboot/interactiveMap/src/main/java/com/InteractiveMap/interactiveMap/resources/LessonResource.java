package com.InteractiveMap.interactiveMap.resources;

import com.InteractiveMap.interactiveMap.entities.Lesson;
import com.InteractiveMap.interactiveMap.entities.Teacher;
import com.InteractiveMap.interactiveMap.entities.User;
import com.InteractiveMap.interactiveMap.services.LessonService;
import com.InteractiveMap.interactiveMap.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lessons")
public class LessonResource {
    @Autowired
    private LessonService service;
    @GetMapping
    public ResponseEntity<List<Lesson>> findAll() {
        List<Lesson> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
