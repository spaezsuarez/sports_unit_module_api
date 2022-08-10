package com.udistrital.sports.unit.service.imp;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.ServiceResponse;
import com.udistrital.sports.unit.dto.teaching.TeachingElementsQueryResponseDTO;
import com.udistrital.sports.unit.dto.teaching.TeachingPreQueryResponseDTO;
import com.udistrital.sports.unit.dto.teaching.TeachingSpaceQueryResponseDTO;
import com.udistrital.sports.unit.service.TeachingSerivice;
import com.udistrital.sports.unit.repository.TeachingRepository;


@Service
public class TeachingServiceImp implements TeachingSerivice{
	
	@Autowired
	private TeachingRepository teachingRepository;

	@Override
	public ServiceResponse<TeachingPreQueryResponseDTO> consultPreRequestParams(String nameEmployee) {
		ServiceResponse<TeachingPreQueryResponseDTO> response = new ServiceResponse<>();
		try {
			TeachingPreQueryResponseDTO responseData = this.teachingRepository.consultPreRequestParams(nameEmployee);
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

	@Override
	public ServiceResponse<TeachingSpaceQueryResponseDTO> consultSpace(String idEmployee) {
		ServiceResponse<TeachingSpaceQueryResponseDTO> response = new ServiceResponse<>();
		try {
			TeachingSpaceQueryResponseDTO responseData = this.teachingRepository.consultSpace(idEmployee);
			if(Objects.isNull(responseData)) {
				response.setStatusHttp(HttpStatus.NOT_FOUND);
				return response;
			}
			List<TeachingElementsQueryResponseDTO> elements = this.teachingRepository.consultElementsBySpace(responseData.getIdSport(),responseData.getIdSpace());
			responseData.setElements(elements);
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
