package com.gabriel.rstatement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gabriel.rstatement.dto.StudentDataDto;
import com.gabriel.rstatement.service.PofficersService;
import com.gabriel.rstatement.service.StudentDataService;
@Controller
@RequestMapping("/statement")
public class StatementController {

    @Autowired
    StudentDataService studentDataService;

    @Autowired
    PofficersService pofficersService;

    @GetMapping("/{id}")
    public String generateStatement(StudentDataDto studentDataDto, Model model, @PathVariable Long id) {

        StudentDataDto details = studentDataService.getAStudentDataById(id);

        model.addAttribute("details", details);

        return "/statement/statement";
    }
}
