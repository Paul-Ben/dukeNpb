package com.gabriel.rstatement.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "student_data")
public class StudentData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
