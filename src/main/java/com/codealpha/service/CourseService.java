package com.codealpha.service;




import java.util.List;
import java.util.Optional;

import com.codealpha.model.Course;

public interface CourseService {
    List<Course> getAllCourses();
    Optional<Course> getCourseById(Long id);
    Course saveCourse(Course course);
    void deleteCourseById(Long id);
}