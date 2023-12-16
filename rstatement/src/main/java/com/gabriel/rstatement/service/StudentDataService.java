package com.gabriel.rstatement.service;

import java.util.List;

import com.gabriel.rstatement.dto.StudentDataDto;
import com.gabriel.rstatement.exceptions.ResourceNotFoundException;

public interface StudentDataService {
    StudentDataDto createStudentData(StudentDataDto StudentDataDto);

    List<StudentDataDto> getAllStudentData();

    // StudentDataDto getStudentDataById(Long id) throws ResourceNotFoundException;
    StudentDataDto getAStudentDataById(Long id) throws ResourceNotFoundException;

    StudentDataDto updateStudentData(StudentDataDto studentDataDto, Long id);

    void deleteStudentDatabyId(Long id);
}
