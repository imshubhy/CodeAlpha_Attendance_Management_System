package com.codealpha.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.codealpha.model.StudentClass;
import com.codealpha.service.ClassService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/classes")
public class ClassController {

    private final ClassService service;

    @Autowired
    public ClassController(ClassService service) {
        this.service = service;
    }

    @GetMapping
    public List<StudentClass> getAllClasses() {
        return service.getAllClasses();
    }

    @GetMapping("/{id}")
    public Optional<StudentClass> getClassById(@PathVariable Long id) {
        return service.getClassById(id);
    }

    @PostMapping
    public StudentClass saveClass(@RequestBody StudentClass studentClass) {
        return service.saveClass(studentClass);
    }

    @DeleteMapping("/{id}")
    public void deleteClassById(@PathVariable Long id) {
        service.deleteClassById(id);
    }
}
