package com.udistrital.sports.unit.dto.teaching;

import java.io.Serializable;

import lombok.Data;

@Data
public class TeachingPreQueryResponseDTO implements Serializable {
	
	private String id;
	private String employee;
	private String campus;
	private String charge;
	private String dateCharge;
	
	private static final long serialVersionUID = 594968252128228629L;

}
