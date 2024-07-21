package com.codealpha.service;



import java.util.List;
import java.util.Optional;

import com.codealpha.model.StudentClass;



public interface ClassService {
    List<StudentClass> getAllClasses();
    Optional<StudentClass> getClassById(Long id);
    StudentClass saveClass(StudentClass studentClass);
    void deleteClassById(Long id);
}
