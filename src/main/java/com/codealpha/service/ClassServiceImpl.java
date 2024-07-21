package com.codealpha.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codealpha.model.StudentClass;
import com.codealpha.repository.ClassRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClassServiceImpl implements ClassService {

    private final ClassRepository repository;

    @Autowired
    public ClassServiceImpl(ClassRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<StudentClass> getAllClasses() {
        return repository.findAll();
    }

    @Override
    public Optional<StudentClass> getClassById(Long id) {
        return repository.findById(id);
    }

    @Override
    public StudentClass saveClass(StudentClass studentClass) {
        return repository.save(studentClass);
    }

    @Override
    public void deleteClassById(Long id) {
        repository.deleteById(id);
    }
}
