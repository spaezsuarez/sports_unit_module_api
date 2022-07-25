package com.udistrital.sports.unit.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.udistrital.sports.unit.dto.employee.EmployeeDTO;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class EmployeeModel{
	
	@JsonProperty("id")
	private Integer idUser;
	private Integer idRole;

	public EmployeeModel(){
		
	}

	public EmployeeModel(EmployeeDTO request){
		setIdRole(request.getIdRole());
		setIdUser(request.getIdUser());
	}
}
