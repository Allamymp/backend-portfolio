package com.InteractiveMap.interactiveMap.repositories;

import com.InteractiveMap.interactiveMap.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson,Long> {
}
