package com.udistrital.sports.unit.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class UserModel {

	@JsonProperty("id")
	private Integer idUser;
	private Integer idCampus;
	private String nameUser;
}
