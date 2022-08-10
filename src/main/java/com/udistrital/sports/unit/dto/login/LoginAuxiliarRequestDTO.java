package com.udistrital.sports.unit.dto.login;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class LoginAuxiliarRequestDTO implements Serializable {

	@NotNull
	private String codeEmployee;
	
	private static final long serialVersionUID = -1548827132677753411L;

}
