package com.udistrital.sports.unit.service;

import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.ServiceResponse;
import com.udistrital.sports.unit.dto.login.LoginAuxiliarRequestDTO;
import com.udistrital.sports.unit.dto.login.LoginAuxiliarResponseDTO;

@Service
public interface LoginService {
	
	public ServiceResponse<LoginAuxiliarResponseDTO> login(LoginAuxiliarRequestDTO request);

}
