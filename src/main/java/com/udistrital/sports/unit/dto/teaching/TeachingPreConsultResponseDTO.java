package com.udistrital.sports.unit.dto.teaching;

import java.io.Serializable;

import lombok.Data;

@Data
public class TeachingPreConsultResponseDTO implements Serializable {
	
	private String codeEmployee;
	private String employee;
	private String campus;
	private String charge;
	private String dateCharge;
	
	private static final long serialVersionUID = 594968252128228629L;

}
