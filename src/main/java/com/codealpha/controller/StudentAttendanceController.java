package com.codealpha.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.codealpha.model.StudentAttendance;
import com.codealpha.service.StudentAttendanceService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/attendances")
public class StudentAttendanceController {

    private final StudentAttendanceService service;

    @Autowired
    public StudentAttendanceController(StudentAttendanceService service) {
        this.service = service;
    }

    @GetMapping
    public List<StudentAttendance> getAllAttendances() {
        return service.getAllAttendances();
    }

    @GetMapping("/{id}")
    public Optional<StudentAttendance> getAttendanceById(@PathVariable Long id) {
        return service.getAttendanceById(id);
    }

    @PostMapping
    public StudentAttendance saveAttendance(@RequestBody StudentAttendance attendance) {
        return service.saveAttendance(attendance);
    }

    @DeleteMapping("/{id}")
    public void deleteAttendanceById(@PathVariable Long id) {
        service.deleteAttendanceById(id);
    }
}
