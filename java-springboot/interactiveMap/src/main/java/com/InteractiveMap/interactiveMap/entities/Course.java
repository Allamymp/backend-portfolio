package com.InteractiveMap.interactiveMap.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_course")
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    @OneToOne
    @JoinColumn(name = "director_id")
    private Teacher director;
    private List<Teacher> teacherList = new ArrayList<>();
    private List<Classes> classesList = new ArrayList<>();


    public Course() {
    }

    public Course(Long id, String name, String email, String phone, Teacher director, List<Teacher> teacherList, List<Classes> classesList) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.director = director;
        this.teacherList = teacherList;
        this.classesList = classesList;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }

    public Teacher getDirector() {
        return director;
    }

    public void setDirector(Teacher director) {
        this.director = director;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;

        return getId().equals(course.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
