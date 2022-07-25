package com.udistrital.sports.unit.dto.employee;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ConsultEmployeeDataRequestDTO implements Serializable {
	
	@NotNull
	private Integer idUser;
	private static final long serialVersionUID = 3868216475398146242L;

}
