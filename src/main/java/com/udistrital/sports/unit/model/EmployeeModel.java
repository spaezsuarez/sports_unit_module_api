package com.udistrital.sports.unit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class EmployeeModel{
	
	@JsonProperty("id")
	private Integer idUser;
	private Integer idRole;
}
