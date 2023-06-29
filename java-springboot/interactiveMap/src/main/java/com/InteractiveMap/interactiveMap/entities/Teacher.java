package com.InteractiveMap.interactiveMap.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_teacher")
public class Teacher implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "teacher")
    @JsonManagedReference
    private List<Lesson> lessonList = new ArrayList<>();
    private String location;
    private boolean specialLocation;

    public Teacher() {
    }

    public Teacher(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.specialLocation = false;
        this.location = "Null test location";
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

    public String getLocation() {
        if(getSpecialLocation()){
        return location;}
        return getActualLocation();
    }

    public void setLocation(String location) {
        if(!getSpecialLocation()){
            throw new RuntimeException("Please change SpecialLocation to true before changes");
        }
        this.location = location;
    }

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public boolean getSpecialLocation() {
        return specialLocation;
    }

    public void setSpecialLocation(boolean specialLocation) {
        this.specialLocation = specialLocation;
    }

    public String getActualLocation() {
        LocalTime currentTime = LocalTime.now();
        for (Lesson lesson : lessonList) {
            LocalTime startHour = lesson.getStartHour();
            LocalTime endHour = lesson.getEndHour();

            if (currentTime.isAfter(startHour) && currentTime.isBefore(endHour)) {
                return lesson.getLocation();
            }
        }
        return "The professor is not in class. Please find him/her at the Course Coordination Office";
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
