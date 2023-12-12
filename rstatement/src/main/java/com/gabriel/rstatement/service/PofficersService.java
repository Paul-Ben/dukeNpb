package com.gabriel.rstatement.service;

import com.gabriel.rstatement.dto.PofficersDto;
import com.gabriel.rstatement.models.Pofficers;

public interface PofficersService {
    Pofficers createPofficer(PofficersDto pofficersDto);
}
