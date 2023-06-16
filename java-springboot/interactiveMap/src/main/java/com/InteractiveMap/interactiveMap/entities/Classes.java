package com.InteractiveMap.interactiveMap.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_class")
public class Classes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;
    private LocalDateTime hour;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    private String name;
    private String location;


    public Classes() {
    }

    public Classes(Long id, Course course, LocalDateTime hour, Teacher teacher, String name, String location) {
        this.id = id;
        this.course = course;
        this.hour = hour;
        this.teacher = teacher;
        this.name = name;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getHour() {
        return hour;
    }

    public void setHour(LocalDateTime hour) {
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Classes classes)) return false;

        return getId().equals(classes.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
