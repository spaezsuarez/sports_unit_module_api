package com.udistrital.sports.unit.service;

import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.ServiceResponse;
import com.udistrital.sports.unit.dto.teaching.TeachingPreConsultResponseDTO;

@Service
public interface TeachingSerivice {
	
	public ServiceResponse<TeachingPreConsultResponseDTO> consultPreRequestParams(String nameEmployee);

}
