package com.codealpha.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codealpha.model.Course;
import com.codealpha.repository.CourseRepository;

import java.util.List;
import java.util.Optional;



@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repository;

    @Autowired
    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    @Override
    public Optional<Course> getCourseById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    @Override
    public void deleteCourseById(Long id) {
        repository.deleteById(id);
    }
}
