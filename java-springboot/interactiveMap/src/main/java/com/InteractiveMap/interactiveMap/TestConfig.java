package com.InteractiveMap.interactiveMap;

import com.InteractiveMap.interactiveMap.entities.Teacher;
import com.InteractiveMap.interactiveMap.entities.User;
import com.InteractiveMap.interactiveMap.repositories.TeacherRepository;
import com.InteractiveMap.interactiveMap.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public  void run(String...args) throws Exception{
        User u1= new User(null,"maria test","test location");
        User u2= new User(null,"joao test","test location");

        userRepository.saveAll(Arrays.asList(u1,u2));

        Teacher t1 = new Teacher(null,"Test Teacher","teacheremail@test.com","classroom test");
        teacherRepository.saveAll(Arrays.asList(t1));
    }



}
