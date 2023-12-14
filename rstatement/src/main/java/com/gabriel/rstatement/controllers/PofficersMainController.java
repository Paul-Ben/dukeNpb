package com.gabriel.rstatement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.gabriel.rstatement.dto.PofficersDto;
import com.gabriel.rstatement.service.PofficersService;

@Controller
public class PofficersMainController {
    @Autowired
    PofficersService pofficersService;

    @GetMapping("/create-pofficer")
    public String showCreateForm() {
        return "/pofficers/create";
    }

    @PostMapping("/create-pofficer/create")
    public String createPofficers(Model model, PofficersDto pofficersDto) {

        PofficersDto pofficers = pofficersService.createPofficer(pofficersDto);
        model.addAttribute(pofficers);
        return "redirect:/pofficers/list";
    }

    @GetMapping("/pofficers/list")
    public String getAllPofficers(Model model) {

        List<PofficersDto> pofficersDtos = pofficersService.getPofficersDtosList();
        model.addAttribute("pofficers", pofficersDtos);
        return "/pofficers/list";

    }

    @GetMapping("/pofficer/{office}")
    public String getPofficersOffice(@PathVariable String office, Model model) {
        PofficersDto pofficersDto = pofficersService.findbyOffice(office);
        model.addAttribute(office, pofficersDto);
        return "/pofficer/pofficer";

    }

}
