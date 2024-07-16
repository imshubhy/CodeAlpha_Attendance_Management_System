package com.codealpha.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codealpha.model.StudentAttendance;

@Repository
public interface StudentAttendanceRepository extends JpaRepository<StudentAttendance, Long> {
}
