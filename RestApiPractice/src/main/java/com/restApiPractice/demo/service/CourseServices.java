package com.restApiPractice.demo.service;

import com.restApiPractice.demo.etities.Courses;

import java.util.List;

public interface CourseServices {
    Courses addCourses(Courses courses);

     List<Courses> getCourses();

     void deleteById(int id);
    //List<Courses> getCourseById(int id);

    Courses updateCourse(int id);
}
