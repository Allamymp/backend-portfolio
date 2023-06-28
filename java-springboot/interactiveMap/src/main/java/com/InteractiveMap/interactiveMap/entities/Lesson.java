package com.InteractiveMap.interactiveMap.entities;

import com.InteractiveMap.interactiveMap.entities.enums.WeekEnum;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalTime;

@Entity
@Table(name = "tb_lesson")
public class Lesson implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name="teacher_id")
    @JsonBackReference
    @JsonIgnoreProperties("lessonList")
    private Teacher teacher;
    private String teacherName;
    @Column(name="start_hour", columnDefinition = "TIME")
    private LocalTime startHour;
    @Column(name = "end_hour", columnDefinition = "TIME")
    private LocalTime endHour;
    private Integer weekday;
    private String location;

    public Lesson() {
    }

    public Lesson(Long id, String name, Teacher teacher, LocalTime startHour,WeekEnum weekday,String location) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.teacherName = teacher.getName();
        this.startHour = startHour;
        setWeekday(weekday);
        this.location = location;
       setEndHour(startHour);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public LocalTime getStartHour() {
        return startHour;
    }

    public void setStartHour(LocalTime startHour) {
        this.startHour = startHour;
    }

    public LocalTime getEndHour() {
        return endHour;
    }

    public void setEndHour(LocalTime endHour) {
        this.endHour = endHour.plusMinutes(45);
    }

    public WeekEnum getWeekday() {
        return WeekEnum.valueOf(weekday);
    }

    public void setWeekday(WeekEnum weekday) {
        if(weekday!= null){
        this.weekday = weekday.getCode();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lesson lesson)) return false;

        return getId().equals(lesson.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
