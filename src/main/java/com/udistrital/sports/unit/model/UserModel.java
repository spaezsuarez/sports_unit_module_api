package com.udistrital.sports.unit.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.udistrital.sports.unit.dto.employee.EmployeeDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

	@JsonProperty("id")
	private Integer idUser;
	private Integer idCampus;
	private String nameUser;

	public UserModel(EmployeeDTO request){
		setIdUser(request.getIdUser());
		setIdCampus(request.getIdCampus());
		setNameUser(request.getNameUser());
	}
}
