package com.udistrital.sports.unit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.lending.LendingResponseDTO;

@Service
public interface LendingService {

    public List<LendingResponseDTO> consultAvaibleLendingElements(String compoundKey);
    
}
