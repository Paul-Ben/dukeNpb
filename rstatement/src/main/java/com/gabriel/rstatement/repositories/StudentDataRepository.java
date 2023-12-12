package com.gabriel.rstatement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.rstatement.models.StudentData;

public interface StudentDataRepository extends JpaRepository<StudentData, Long> {
    
}
