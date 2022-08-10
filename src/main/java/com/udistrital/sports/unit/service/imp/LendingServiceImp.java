package com.udistrital.sports.unit.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.lending.LendingResponseDTO;
import com.udistrital.sports.unit.repository.LendingElementsRepository;
import com.udistrital.sports.unit.service.LendingService;

@Service
public class LendingServiceImp implements LendingService {

    @Autowired
    private LendingElementsRepository lendingElementsRepository;

    @Override
    public List<LendingResponseDTO> consultAvaibleLendingElements(String compoundKey) {
        
        String[] compoundKeyArray = compoundKey.split("-");

        return lendingElementsRepository.consultAvaibleLendingElements(compoundKeyArray[0], compoundKeyArray[1]);

    }
    
}
