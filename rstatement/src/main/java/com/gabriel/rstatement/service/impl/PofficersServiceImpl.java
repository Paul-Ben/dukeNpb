package com.gabriel.rstatement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.rstatement.dto.PofficersDto;
import com.gabriel.rstatement.mappers.Mapper;
import com.gabriel.rstatement.models.Pofficers;
import com.gabriel.rstatement.repositories.PofficersRepository;
import com.gabriel.rstatement.service.PofficersService;

@Service
public class PofficersServiceImpl implements PofficersService {

    @Autowired
    PofficersRepository pofficersRepository;

    @Autowired
    Mapper mapper;

    @Override
    public PofficersDto createPofficer(PofficersDto pofficersDto) {
        Pofficers pofficers = mapper.convertToEntity(pofficersDto);
        Pofficers savedPofficers = pofficersRepository.save(pofficers);
       
        return mapper.convertToDto(savedPofficers);
    }

    @Override
    public List<PofficersDto> getPofficersDtosList() {
        List<Pofficers> pofficers = pofficersRepository.findAll();
        return pofficers.stream().map((pofficer)->mapper.convertToDto(pofficer)).toList();
    }

}
