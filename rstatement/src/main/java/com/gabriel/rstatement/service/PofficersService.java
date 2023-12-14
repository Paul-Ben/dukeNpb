package com.gabriel.rstatement.service;

import java.util.List;

import com.gabriel.rstatement.dto.PofficersDto;

public interface PofficersService {
    PofficersDto createPofficer(PofficersDto pofficersDto);
    List<PofficersDto> getPofficersDtosList();
    PofficersDto findbyOffice(String office);
}
