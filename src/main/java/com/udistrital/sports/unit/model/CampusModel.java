package com.udistrital.sports.unit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CampusModel {
	
	@JsonProperty("id")
	private Integer idCampus;
	private String nameCampus;
	private String directionCampus;
}
