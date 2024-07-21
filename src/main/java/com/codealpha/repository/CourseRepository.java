package com.codealpha.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codealpha.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}