package com.gabriel.rstatement.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.gabriel.rstatement.dto.StudentDataDto;
import com.gabriel.rstatement.exceptions.ResourceNotFoundException;
import com.gabriel.rstatement.models.StudentData;

public interface StudentDataService {
    StudentDataDto createStudentData(StudentDataDto StudentDataDto);

    List<StudentDataDto> getAllStudentData();
    
    StudentData findByMatNumber(String matNumber);

    // StudentDataDto getStudentDataById(Long id) throws ResourceNotFoundException;
    StudentDataDto getAStudentDataById(Long id) throws ResourceNotFoundException;
    StudentData getStudentDataByID(Long id);

    StudentDataDto updateStudentData(StudentDataDto studentDataDto, Long id);
    void saveAll(List<StudentData> studentDatas);
    void saveFromCsv(MultipartFile file) throws IOException;

    void deleteStudentDatabyId(Long id);
}
