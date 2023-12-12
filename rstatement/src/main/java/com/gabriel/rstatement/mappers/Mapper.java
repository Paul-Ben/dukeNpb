package com.gabriel.rstatement.mappers;

import org.springframework.stereotype.Component;

import com.gabriel.rstatement.dto.PofficersDto;
import com.gabriel.rstatement.dto.StudentDataDto;
import com.gabriel.rstatement.models.Pofficers;
import com.gabriel.rstatement.models.StudentData;
@Component
public class Mapper {

    public PofficersDto convertToDto(Pofficers pofficers) {

        PofficersDto pofficersDto = new PofficersDto();
        pofficersDto.setId(pofficers.getId());
        pofficersDto.setFirstName(pofficers.getFirstName());
        pofficersDto.setMiddleName(pofficers.getMiddleName());
        pofficersDto.setLastName(pofficers.getLastName());
        pofficersDto.setTitle(pofficers.getTitle());
        pofficersDto.setOffice(pofficers.getOffice());
        pofficersDto.setQualifications(pofficers.getQualifications());

        return pofficersDto;
    }

    public Pofficers convertToEntity(PofficersDto pofficersDto){
         Pofficers pofficers = new Pofficers();
        pofficers.setId(pofficersDto.getId());
        pofficers.setFirstName(pofficersDto.getFirstName());
        pofficers.setMiddleName(pofficersDto.getMiddleName());
        pofficers.setLastName(pofficersDto.getLastName());
        pofficers.setTitle(pofficersDto.getTitle());
        pofficers.setOffice(pofficersDto.getOffice());
        pofficers.setQualifications(pofficersDto.getQualifications());

        return pofficers;
    }

    public StudentDataDto convertToStudentDataDto(StudentData studentData){
        StudentDataDto studentDataDto = new StudentDataDto();
        studentDataDto.setCgpa(studentData.getCgpa());
        studentDataDto.setClassOfDegree(studentData.getClassOfDegree());
        studentDataDto.setCourse(studentData.getCourse());
        studentDataDto.setDateOfSenateApproval(studentData.getDateOfSenateApproval());
        studentDataDto.setFirstName(studentData.getFirstName());
        studentDataDto.setId(studentData.getId());
        studentDataDto.setLastName(studentData.getLastName());
        studentDataDto.setMatNumber(studentData.getMatNumber());
        studentDataDto.setSessionAdmmitted(studentData.getSessionAdmmitted());
        studentDataDto.setMiddleName(studentData.getMiddleName());
        studentDataDto.setSessionGraduated(studentData.getSessionGraduated());
        studentDataDto.setTimeStamp(studentData.getTimeStamp());
        

        return studentDataDto;
    }

    public StudentData convertToStudentDataEntity(StudentDataDto studentDataDto){
         StudentData studentData = new StudentData();
        studentData.setCgpa(studentDataDto.getCgpa());
        studentData.setClassOfDegree(studentDataDto.getClassOfDegree());
        studentData.setCourse(studentDataDto.getCourse());
        studentData.setDateOfSenateApproval(studentDataDto.getDateOfSenateApproval());
        studentData.setFirstName(studentDataDto.getFirstName());
        studentData.setId(studentDataDto.getId());
        studentData.setLastName(studentDataDto.getLastName());
        studentData.setMatNumber(studentDataDto.getMatNumber());
        studentData.setSessionAdmmitted(studentDataDto.getSessionAdmmitted());
        studentData.setMiddleName(studentDataDto.getMiddleName());
        studentData.setSessionGraduated(studentDataDto.getSessionGraduated());
        studentData.setTimeStamp(studentDataDto.getTimeStamp());
        

        return studentData;
    }
}
