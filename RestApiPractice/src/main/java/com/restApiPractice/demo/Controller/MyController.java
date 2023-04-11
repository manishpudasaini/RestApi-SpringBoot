package com.restApiPractice.demo.Controller;

import com.restApiPractice.demo.etities.Courses;
import com.restApiPractice.demo.service.CourseServiceImpl;
import com.restApiPractice.demo.service.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    public CourseServices courseService;


    @Autowired
    public MyController(CourseServices courseService){
        this.courseService = courseService;
    }



    @GetMapping ("/courses/{id}")
    public Courses geTCourseId(@PathVariable("id") int id){
       return courseService.getCourseById(id);
    }

    @PostMapping(path = "/courses")
    public Courses addCourses(@RequestBody Courses courses){
        return courseService.addCourses(courses);
    }


    @GetMapping("/courses")
    public ResponseEntity< List<Courses> > getCourses(){
      List<Courses> coursesList = courseService.getCourses();
      if(coursesList.size() <=0){
          return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
      }else {
          return ResponseEntity.of(Optional.of(coursesList));
      }

    }

    @DeleteMapping ("/courses/delete/{id}")
    public void deleteCourse(@PathVariable("id") int id){
        courseService.deleteById(id);
    }

    @PutMapping("/courses/{id}")
    public Courses updateCourse(@PathVariable("id") int id){
        return courseService.updateCourse(id);
    }
}
