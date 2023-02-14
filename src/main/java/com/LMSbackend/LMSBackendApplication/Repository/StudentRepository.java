package com.LMSbackend.LMSBackendApplication.Repository;

import com.LMSbackend.LMSBackendApplication.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
