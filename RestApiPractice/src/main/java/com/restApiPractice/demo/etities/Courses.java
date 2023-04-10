package com.restApiPractice.demo.etities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;
    private String courseName;
    private String courseFee;

    public Courses( String courseName, String courseFee) {
        this.courseName = courseName;
        this.courseFee = courseFee;
    }

    public Courses() {

    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(String courseFee) {
        this.courseFee = courseFee;
    }
}
