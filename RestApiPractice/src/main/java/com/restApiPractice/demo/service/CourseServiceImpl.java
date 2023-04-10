package com.restApiPractice.demo.service;

import com.restApiPractice.demo.etities.Courses;
import com.restApiPractice.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseServices{

    public CourseRepository courseRepository;

    @Autowired
    CourseServiceImpl(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    List<Courses> courseList;

    public CourseServiceImpl() {



    }
    @Override
    public List<Courses> getCourses() {
        List<Courses> coursesList = courseRepository.findAll();
        return coursesList ;
    }



//    @Override
//    public List<Courses> getCourseById(int id) {
//        List<Courses> coursesById = new ArrayList<>();
//        for(Courses c:courseList){
//            if(c.getCourseId() == id){
//                coursesById.add(c);
//            }
//        }
//        return coursesById;
//    }

    @Override
    public Courses addCourses(Courses courses) {
        return courseRepository.save(courses);
    }

    @Override
    public void deleteById(int id) {
        courseRepository.deleteById(id);
    }
}
