package com.InteractiveMap.interactiveMap;
import com.InteractiveMap.interactiveMap.entities.Lesson;
import com.InteractiveMap.interactiveMap.entities.Teacher;
import com.InteractiveMap.interactiveMap.entities.User;
import com.InteractiveMap.interactiveMap.entities.enums.WeekEnum;
import com.InteractiveMap.interactiveMap.repositories.LessonRepository;
import com.InteractiveMap.interactiveMap.repositories.TeacherRepository;
import com.InteractiveMap.interactiveMap.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalTime;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private LessonRepository lessonRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "maria test", "test location");
        User u2 = new User(null, "joao test", "test location");

        userRepository.saveAll(Arrays.asList(u1, u2));

        Teacher t1 = new Teacher(null, "Test Teacher", "teacheremail@test.com");
        Teacher t2 = new Teacher(null, "Test Teacher 2", "test@email.com");
        teacherRepository.save(t1);
        teacherRepository.save(t2);

        Lesson l1 = new Lesson(null, "test lesson", t1, LocalTime.of(7, 0), WeekEnum.MONDAY,
                "location test 1");
        Lesson l2 = new Lesson(null, "test lesson 2", t2, LocalTime.of(7, 45), WeekEnum.FRIDAY,
                "location test 1");
        lessonRepository.saveAll(Arrays.asList(l1, l2));

        t1.getLessonList().add(l1);
        t2.getLessonList().add(l2);

        teacherRepository.save(t1);
        teacherRepository.save(t2);
    }
}
