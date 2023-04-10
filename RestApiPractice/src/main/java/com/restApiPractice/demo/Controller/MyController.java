package com.restApiPractice.demo.Controller;

import com.restApiPractice.demo.etities.Courses;
import com.restApiPractice.demo.service.CourseServiceImpl;
import com.restApiPractice.demo.service.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    public CourseServices courseService;


    @Autowired
    public MyController(CourseServices courseService){
        this.courseService = courseService;
    }


//
//    @GetMapping ("/courses/{id}")
//    public List<Courses> geTCourseId(@PathVariable("id") int id){
//       return courseService.getCourseById(id);
//    }

    @PostMapping(path = "/courses")
    public Courses addCourses(@RequestBody Courses courses){
        return courseService.addCourses(courses);
    }


        @GetMapping("/courses")
    public List<Courses> getCourses(){
        return courseService.getCourses();
    }

    @GetMapping("courses/delete/{id}")
    public void deleteCourse(@PathVariable("id") int id){
        courseService.deleteById(id);
    }
}
