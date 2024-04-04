package com.gabriel.rstatement.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gabriel.rstatement.dto.StudentDataDto;
import com.gabriel.rstatement.models.StudentData;
import com.gabriel.rstatement.service.StudentDataService;

@Controller
@RequestMapping("/student")
public class StudentDataController {
    @Autowired
    StudentDataService studentDataService;

    // http://localhost:8080/student/create
    @GetMapping("/create")
    public String createForm() {
        return "/student_data/create";
    }

    @PostMapping("/created")
    public String createStudentData(Model model, StudentDataDto studentDataDto) {
        StudentDataDto studentData = studentDataService.createStudentData(studentDataDto);
        model.addAttribute(studentData);
        return "redirect:/student/create";
    }

    @GetMapping
    public String getAllStudentData(Model model) {
        List<StudentDataDto> studentData = studentDataService.getAllStudentData();
        model.addAttribute("studentData", studentData);
        return "/student_data/datalist";
    }

    @GetMapping("/{id}")
    public String getStudentDataById(@PathVariable Long id, Model model) {
        StudentDataDto studentDataById = studentDataService.getAStudentDataById(id);
        model.addAttribute("studentById", studentDataById);
        return "/student_data/show";
    }

    public String showUpdateForm(Long id) {

        return "/";
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<StudentDataDto> updateStudentData(@RequestBody StudentDataDto studentDataDto,
            @PathVariable Long id) {
        StudentDataDto updatedStudentData = studentDataService.updateStudentData(studentDataDto, id);
        return ResponseEntity.ok(updatedStudentData);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentDatabyId(@PathVariable Long id) {

        studentDataService.deleteStudentDatabyId(id);

        return "Data deleted";
    }

    @GetMapping("/uploadForm")
    public String uploadForm() {
        return "/student_data/uploadForm";
    }

    @PostMapping("/upload")
    public String uploadStudnetData(@RequestParam("file") MultipartFile file) throws IOException {
        studentDataService.saveFromCsv(file);
        return "/student_data/uploadForm";
    }

    @GetMapping("/result")
    public String getByMatricNumber(@RequestParam String matNumber, Model model) {
        try {
            StudentData studentData1 = studentDataService.findByMatNumber(matNumber);
            Long studentId = studentData1.getId();
            StudentData studentData = studentDataService.getStudentDataByID(studentId);
            model.addAttribute("studentData", studentData);
            return "/student_data/search_result";
        } catch (Exception e) {
            return "/errors/resourcenotfound";
        }

    }
}
