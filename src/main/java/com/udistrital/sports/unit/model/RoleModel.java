package com.udistrital.sports.unit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RoleModel {
	
	@JsonProperty("id")
	private Integer idRole;
	private String nameRole;
}
