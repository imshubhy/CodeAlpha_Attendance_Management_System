package com.codealpha.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.codealpha.model.StudentAttendance;
import com.codealpha.model.StudentClass;
import com.codealpha.service.ClassService;
import com.codealpha.service.StudentAttendanceService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/attendances")
public class StudentAttendanceController {

    private final StudentAttendanceService attendanceService;
    private final ClassService classService;

    @Autowired
    public StudentAttendanceController(StudentAttendanceService attendanceService, ClassService classService) {
        this.attendanceService = attendanceService;
        this.classService = classService;
    }

    @GetMapping
    public List<StudentAttendance> getAllAttendances() {
        return attendanceService.getAllAttendances();
    }

    @GetMapping("/{id}")
    public Optional<StudentAttendance> getAttendanceById(@PathVariable Long id) {
        return attendanceService.getAttendanceById(id);
    }

    @PostMapping
    public StudentAttendance saveAttendance(@RequestBody StudentAttendance attendance) {
        Optional<StudentClass> studentClass = classService.getClassById(attendance.getStudentClass().getId());
        if (!studentClass.isPresent()) {
            throw new RuntimeException("Class not found with id " + attendance.getStudentClass().getId());
        }
        attendance.setStudentClass(studentClass.get());
        return attendanceService.saveAttendance(attendance);
    }

    @DeleteMapping("/{id}")
    public void deleteAttendanceById(@PathVariable Long id) {
        attendanceService.deleteAttendanceById(id);
    }
}
