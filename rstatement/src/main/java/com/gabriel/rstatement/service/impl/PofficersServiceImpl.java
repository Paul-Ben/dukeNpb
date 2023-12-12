package com.gabriel.rstatement.service.impl;

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
    public Pofficers createPofficer(PofficersDto pofficersDto) {
       
        return pofficersRepository.save(mapper.convertToEntity(pofficersDto));
    }

}
