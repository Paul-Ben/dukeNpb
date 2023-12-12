package com.gabriel.rstatement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.rstatement.dto.StudentDataDto;
import com.gabriel.rstatement.models.StudentData;
import com.gabriel.rstatement.service.StudentDataService;
@RestController
@RequestMapping("/api/student-data")
public class StudentDataRestController {
    @Autowired
    StudentDataService studentDataService;

    @PostMapping
    public ResponseEntity<StudentData> createStudentData(@RequestBody StudentDataDto studentDataDto){
        StudentData studentData = studentDataService.createStudentData(studentDataDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(studentData);
    }
}
