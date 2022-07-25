package com.udistrital.sports.unit.dto.campus;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ConsultCampusDataRequestDTO implements Serializable {
	
	@NotNull
	private Integer idCampus;

    private static final long serialVersionUID = 3868216475398146242L;

}
