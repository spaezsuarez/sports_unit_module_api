package com.udistrital.sports.unit.dto.role;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ConsultRoleDataRequestDTO implements Serializable {
	
	@NotNull
	private Integer idRole;
	private static final long serialVersionUID = 3868216475398146242L;

}
