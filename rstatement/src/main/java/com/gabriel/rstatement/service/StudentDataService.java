package com.gabriel.rstatement.service;

import com.gabriel.rstatement.dto.StudentDataDto;
import com.gabriel.rstatement.models.StudentData;

public interface StudentDataService {
    StudentData createStudentData(StudentDataDto StudentDataDto);
}
