package com.gabriel.rstatement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.rstatement.dto.StudentDataDto;
import com.gabriel.rstatement.mappers.Mapper;
import com.gabriel.rstatement.models.StudentData;
import com.gabriel.rstatement.repositories.StudentDataRepository;
import com.gabriel.rstatement.service.StudentDataService;
@Service
public class StudentDataServiceImpl implements StudentDataService {

    @Autowired
    StudentDataRepository studentDataRepository;

    @Autowired
    Mapper mapper;

    @Override
    public StudentData createStudentData(StudentDataDto StudentDataDto) {
        
        return studentDataRepository.save(mapper.convertToStudentDataEntity(StudentDataDto));
    }
    
}
