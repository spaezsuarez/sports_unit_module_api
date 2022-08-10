package com.udistrital.sports.unit.service.imp;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.ServiceResponse;
import com.udistrital.sports.unit.dto.login.LoginAuxiliarRequestDTO;
import com.udistrital.sports.unit.dto.login.LoginAuxiliarResponseDTO;
import com.udistrital.sports.unit.service.LoginService;
import com.udistrital.sports.unit.repository.LoginRepository;

@Service
public class LoginServiceImp implements LoginService {
	
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public ServiceResponse<LoginAuxiliarResponseDTO> login(LoginAuxiliarRequestDTO request) {
		ServiceResponse<LoginAuxiliarResponseDTO> response = new ServiceResponse<>();
		try {
			List<LoginAuxiliarResponseDTO> responseData = loginRepository.loginAuxiliar(request.getCodeEmployee());
			if(Objects.isNull(responseData) || responseData.isEmpty()) {
				response.setStatusHttp(HttpStatus.UNAUTHORIZED);
				return response;
			}
			response.setData(responseData.get(0));
			response.setStatusHttp(HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			response.setStatusHttp(HttpStatus.UNAUTHORIZED);
			return response;
		}
		return response;
	}
}
