package com.codealpha.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codealpha.model.StudentAttendance;
import com.codealpha.repository.StudentAttendanceRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentAttendanceServiceImpl implements StudentAttendanceService {

    private final StudentAttendanceRepository repository;

    @Autowired
    public StudentAttendanceServiceImpl(StudentAttendanceRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<StudentAttendance> getAllAttendances() {
        return repository.findAll();
    }

    @Override
    public Optional<StudentAttendance> getAttendanceById(Long id) {
        return repository.findById(id);
    }

    @Override
    public StudentAttendance saveAttendance(StudentAttendance attendance) {
        return repository.save(attendance);
    }

    @Override
    public void deleteAttendanceById(Long id) {
        repository.deleteById(id);
    }
}
