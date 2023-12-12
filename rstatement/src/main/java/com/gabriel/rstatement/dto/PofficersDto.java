package com.gabriel.rstatement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PofficersDto {
    private Long id;
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String qualifications;
    private String office;
}
