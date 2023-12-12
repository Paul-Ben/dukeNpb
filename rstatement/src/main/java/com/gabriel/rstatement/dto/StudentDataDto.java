package com.gabriel.rstatement.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDataDto {
    private Long id;
    private String matNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private String course;
    private String sessionAdmmitted;
    private String sessionGraduated;
    private Double cgpa;
    private String dateOfSenateApproval;
    private String classOfDegree;
    private Date timeStamp;
}
