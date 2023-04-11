package com.restApiPractice.demo.service;

import com.restApiPractice.demo.etities.Courses;
import com.restApiPractice.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseServices{

    public CourseRepository courseRepository;

    @Autowired
    CourseServiceImpl(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    public CourseServiceImpl() {
    }

    //get method

    @Override
    public List<Courses> getCourses() {
        List<Courses> coursesList = courseRepository.findAll();
        return coursesList ;
    }



    //put method
    @Override
    public Courses addCourses(Courses courses) {
        return courseRepository.save(courses);
    }


    //delete method
    @Override
    public void deleteById(int id) {
        courseRepository.deleteById(id);
    }


    //update method
    @Override
    public Courses updateCourse(int id) {
        Optional<Courses> optionalCourses = courseRepository.findById(id);
        //if there is the course of that id it will give the value otherwise throw exception
        Courses courses = optionalCourses.get();

        courses.setCourseName("MBBS");
        courseRepository.save(courses);


        return courses;
    }
}
