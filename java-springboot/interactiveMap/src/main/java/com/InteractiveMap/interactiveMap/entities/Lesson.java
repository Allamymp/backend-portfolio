package com.InteractiveMap.interactiveMap.entities;

import com.InteractiveMap.interactiveMap.entities.enums.WeekEnum;
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
    private Teacher teacher;
    private String teacherName;
    @Column(name="start_hour", columnDefinition = "TIME")
    private LocalTime startHour;
    @Column(name = "end_hour", columnDefinition = "TIME")
    private LocalTime endHour;
    private WeekEnum weekday;


    public Lesson() {
    }

    public Lesson(Long id, String name, Teacher teacher, LocalTime startHour,WeekEnum weekday) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.teacherName = teacher.getName();
        this.startHour = startHour;
       setEndHour(startHour);
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
        return weekday;
    }

    public void setWeekday(WeekEnum weekday) {
        this.weekday = weekday;
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
