package com.udistrital.sports.unit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udistrital.sports.unit.dto.ServiceResponse;
import com.udistrital.sports.unit.dto.teaching.TeachingPreConsultResponseDTO;
import com.udistrital.sports.unit.service.TeachingSerivice;

@RestController
@RequestMapping(value = "/teaching")
@CrossOrigin("*")
public class TeachingAssistanceController {
	
	@Autowired
	private TeachingSerivice teachingService;
	
	@GetMapping(value = "/{nameEmployee}")
	public ResponseEntity<TeachingPreConsultResponseDTO> consultPreRequestParams(
			@PathVariable("nameEmployee") String nameEmployee){
		ServiceResponse<TeachingPreConsultResponseDTO> serviceResponse = new ServiceResponse<>(); 
		serviceResponse = teachingService.consultPreRequestParams(nameEmployee);
		return new ResponseEntity<>(serviceResponse.getData(),serviceResponse.getStatusHttp());
	}

}
