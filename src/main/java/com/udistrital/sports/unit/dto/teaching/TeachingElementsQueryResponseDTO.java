package com.udistrital.sports.unit.dto.teaching;

import java.io.Serializable;

import lombok.Data;

@Data
public class TeachingElementsQueryResponseDTO implements Serializable{
	
	private String idElement;
	private String typeElement;
	private String element;
	private String state;
	
	private static final long serialVersionUID = -5476997264883696757L;
	
	

}
