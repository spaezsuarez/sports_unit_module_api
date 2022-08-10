package com.udistrital.sports.unit.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udistrital.sports.unit.dto.login.LoginAuxiliarResponseDTO;
import com.udistrital.sports.unit.dto.ServiceResponse;
import com.udistrital.sports.unit.dto.login.LoginAuxiliarRequestDTO;
import com.udistrital.sports.unit.service.LoginService;

@RestController
@RequestMapping(value = "/login")
@CrossOrigin("*")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping
	public ResponseEntity<LoginAuxiliarResponseDTO> loginAuxiliar(
			 @RequestBody @Valid LoginAuxiliarRequestDTO request,
			 BindingResult results){
		ServiceResponse<LoginAuxiliarResponseDTO> serviceResponse = new ServiceResponse<>(); 
		if(results.hasErrors()) {
			return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
		}
		serviceResponse = loginService.login(request);
		return new ResponseEntity<>(serviceResponse.getData(),serviceResponse.getStatusHttp());
	}

}
