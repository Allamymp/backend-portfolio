package com.InteractiveMap.interactiveMap.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "tb_teacher")
public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Course course;
    private String location;
    private List<Classes> classesList = new ArrayList<>();

    public Teacher() {
    }

    public Teacher(Long id, String name, String email, Course course, List<Classes> classesList, String location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.classesList = classesList;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher teacher)) return false;

        return getId().equals(teacher.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
