package com.codealpha.service;





import java.util.List;
import java.util.Optional;

import com.codealpha.model.StudentAttendance;

public interface StudentAttendanceService {
    List<StudentAttendance> getAllAttendances();
    Optional<StudentAttendance> getAttendanceById(Long id);
    StudentAttendance saveAttendance(StudentAttendance attendance);
    void deleteAttendanceById(Long id);
}
