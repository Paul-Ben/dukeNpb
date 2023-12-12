package com.gabriel.rstatement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.rstatement.dto.PofficersDto;
import com.gabriel.rstatement.service.PofficersService;



@RestController
@RequestMapping("/api/pofficers")
public class PofficersRestController {
    
    @Autowired
    PofficersService pofficersService;

    @PostMapping
    public ResponseEntity<PofficersDto> createPofficers(@RequestBody PofficersDto pofficersDto){
        
        PofficersDto pofficers = pofficersService.createPofficer(pofficersDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(pofficers);
    }
    
    @GetMapping
    public ResponseEntity<List<PofficersDto>> getAllPofficers(){

        List<PofficersDto> pofficersDtos = pofficersService.getPofficersDtosList();
        return ResponseEntity.status(HttpStatus.OK).body(pofficersDtos);
        
    }
}
