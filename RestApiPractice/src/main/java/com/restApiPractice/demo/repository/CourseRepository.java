package com.restApiPractice.demo.repository;

import com.restApiPractice.demo.etities.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Courses,Integer> {
}
