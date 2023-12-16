package com.gabriel.rstatement.service.impl;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.rstatement.dto.StudentDataDto;
import com.gabriel.rstatement.exceptions.ResourceNotFoundException;
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
    public StudentDataDto createStudentData(StudentDataDto StudentDataDto) {
        StudentData studentData = mapper.convertToStudentDataEntity(StudentDataDto);
        studentData.setTimeStamp(Date.from(Instant.now()));
        StudentData savedStudentData = studentDataRepository.save(studentData);
        return mapper.convertToStudentDataDto(savedStudentData);
    }

    @Override
    public List<StudentDataDto> getAllStudentData() {
        List<StudentData> studentDatas = studentDataRepository.findAll();
        return studentDatas.stream().map((studentData) -> mapper.convertToStudentDataDto(studentData)).toList();
    }

    // @Override
    // public StudentDataDto getStudentDataById(Long id) {
    // StudentData studentDataById = studentDataRepository.findById(id).get();

    // if (studentDataRepository.existsById(studentDataById.getId())) {
    // System.out.println("It Exists!!!!!");
    // StudentDataDto studentDataDto =
    // mapper.convertToStudentDataDto(studentDataById);
    // return studentDataDto;
    // }else{
    // throw new ResourceNotFoundException("Resource with this id "+id+" does not
    // exist.");
    // }

    // }

    @Override
    public void deleteStudentDatabyId(Long id) {
        studentDataRepository.deleteById(id);
    }

    @Override
    public StudentDataDto updateStudentData(StudentDataDto studentDataDto, Long id) {
        StudentData studentToUpdate = studentDataRepository.findById(id).get();
        studentToUpdate.setCgpa(studentDataDto.getCgpa());
        studentToUpdate.setClassOfDegree(studentDataDto.getClassOfDegree());
        studentToUpdate.setCourse(studentDataDto.getCourse());
        studentToUpdate.setDateOfSenateApproval(studentDataDto.getDateOfSenateApproval());
        studentToUpdate.setFirstName(studentDataDto.getFirstName());
        studentToUpdate.setLastName(studentDataDto.getLastName());
        studentToUpdate.setMatNumber(studentDataDto.getMatNumber());
        studentToUpdate.setMiddleName(studentDataDto.getMiddleName());
        studentToUpdate.setSessionAdmmitted(studentDataDto.getSessionAdmmitted());
        studentToUpdate.setSessionGraduated(studentDataDto.getSessionGraduated());
        studentToUpdate.setTimeStamp(studentDataDto.getTimeStamp());
        StudentData savedStudentData = studentDataRepository.save(studentToUpdate);

        return mapper.convertToStudentDataDto(savedStudentData);
    }

    @Override
    public StudentDataDto getAStudentDataById(Long id) throws ResourceNotFoundException {
        Optional<StudentData> studentDataById = studentDataRepository.findById(id);

        if (studentDataById.isPresent()) {
            StudentDataDto studentDataDto = mapper.convertToStudentDataDto(studentDataById.get());

            return studentDataDto;
        } else {
            throw new ResourceNotFoundException("Resource with this id " + id + " does not exist.");
        }
    }

}
