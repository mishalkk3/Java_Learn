package com.mishal.learnspringboot.courses.controller;

import com.mishal.learnspringboot.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course(1, "Learn Microservices","Lenin"), new Course(2,"Java Beginner","Someone"),
                new Course(3,"Pytho Programming", "CodewithMoosh"));
    }

    @GetMapping("/courses/1")
    public List<Course> getCourseDetails() {
        return Arrays.asList(new Course(1, "Learn Microservices","Lenin"));
    }
}
