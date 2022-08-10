package com.udistrital.sports.unit.service;

import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.ServiceResponse;
import com.udistrital.sports.unit.dto.teaching.TeachingPreQueryResponseDTO;
import com.udistrital.sports.unit.dto.teaching.TeachingSpaceQueryResponseDTO;

@Service
public interface TeachingSerivice {
	
	public ServiceResponse<TeachingPreQueryResponseDTO> consultPreRequestParams(String nameEmployee);
	public ServiceResponse<TeachingSpaceQueryResponseDTO> consultSpace(String idEmployee);

}
