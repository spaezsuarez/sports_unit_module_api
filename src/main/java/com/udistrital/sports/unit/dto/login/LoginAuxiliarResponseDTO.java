package com.udistrital.sports.unit.dto.login;

import java.io.Serializable;

import lombok.Data;

@Data
public class LoginAuxiliarResponseDTO implements Serializable{
		
	private String employee;
	private String campus;
	private String charge;
	private String dateCharge;
	private String hourCharge;
	
	private static final long serialVersionUID = 2827763544613021635L;
}
