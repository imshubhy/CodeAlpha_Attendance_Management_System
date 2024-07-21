package com.codealpha.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codealpha.model.StudentClass;

@Repository
public interface ClassRepository extends JpaRepository<StudentClass, Long> {
}