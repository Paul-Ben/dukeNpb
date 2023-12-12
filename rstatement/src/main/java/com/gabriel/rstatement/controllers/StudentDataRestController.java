package com.gabriel.rstatement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.rstatement.dto.StudentDataDto;
import com.gabriel.rstatement.service.StudentDataService;

@RestController
@RequestMapping("/api/student-data")
public class StudentDataRestController {
    @Autowired
    StudentDataService studentDataService;

    @PostMapping
    public ResponseEntity<StudentDataDto> createStudentData(@RequestBody StudentDataDto studentDataDto) {
        StudentDataDto studentData = studentDataService.createStudentData(studentDataDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(studentData);
    }

    @GetMapping
    public ResponseEntity<List<StudentDataDto>> getAllStudentData() {
        List<StudentDataDto> studentData = studentDataService.getAllStudentData();
        return ResponseEntity.ok(studentData);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDataDto> getStudentDataById(@PathVariable Long id) {
        StudentDataDto studentDataById = studentDataService.getStudentDataById(id);
        return ResponseEntity.ok(studentDataById);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<StudentDataDto> updateStudentData(@RequestBody StudentDataDto studentDataDto,
            @PathVariable Long id) {
        StudentDataDto updatedStudentData = studentDataService.updateStudentData(studentDataDto, id);
        return ResponseEntity.ok(updatedStudentData);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentDatabyId(@PathVariable Long id) {

        studentDataService.deleteStudentDatabyId(id);

        return "Data deleted";
    }

}
