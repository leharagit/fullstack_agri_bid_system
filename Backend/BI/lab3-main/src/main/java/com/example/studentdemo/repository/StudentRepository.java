package com.example.studentdemo.repository;

import com.example.studentdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Custom method to find students by their year of enrollment
    List<Student> findByYearOfEnrollment(int yearOfEnrollment);
}
