package com.udistrital.sports.unit.service.imp;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.ServiceResponse;
import com.udistrital.sports.unit.dto.teaching.TeachingPreConsultResponseDTO;
import com.udistrital.sports.unit.service.TeachingSerivice;
import com.udistrital.sports.unit.repository.TeachingRepository;


@Service
public class TeachingServiceImp implements TeachingSerivice{
	
	@Autowired
	private TeachingRepository teachingRepository;

	@Override
	public ServiceResponse<TeachingPreConsultResponseDTO> consultPreRequestParams(String nameEmployee) {
		ServiceResponse<TeachingPreConsultResponseDTO> response = new ServiceResponse<>();
		try {
			TeachingPreConsultResponseDTO responseData = this.teachingRepository.consultPreRequestParams(nameEmployee);
			if(Objects.isNull(responseData)) {
				response.setStatusHttp(HttpStatus.NOT_FOUND);
				return response;
			}
			response.setStatusHttp(HttpStatus.OK);
			response.setData(responseData);
			return response;
		}catch(EmptyResultDataAccessException e) {
			e.printStackTrace();
			response.setStatusHttp(HttpStatus.INTERNAL_SERVER_ERROR);
			return response;
		}
	}

}
