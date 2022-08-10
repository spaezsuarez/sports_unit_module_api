package com.udistrital.sports.unit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udistrital.sports.unit.dto.lending.LendingResponseDTO;
import com.udistrital.sports.unit.service.LendingService;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping(value = "/lending")
@CrossOrigin("*")
@Log4j2
public class LeindingElementsController {

    @Autowired
    private LendingService lendingService;
    
    @GetMapping(value = "/{compoundKey}")
    public List<LendingResponseDTO> consultAvaibleLendingElements(@PathVariable("compoundKey") String compoundKey) {

        log.info(compoundKey);
        
        return lendingService.consultAvaibleLendingElements(compoundKey);
        
    }

}
