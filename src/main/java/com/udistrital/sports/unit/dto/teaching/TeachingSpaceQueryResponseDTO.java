package com.udistrital.sports.unit.dto.teaching;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class TeachingSpaceQueryResponseDTO implements Serializable {
	
	private String idSport;
	private String idSpace;
	private String typeActivity;
	private String space;
	private String sport;
	private String employee;
	private List<TeachingElementsQueryResponseDTO> elements;
	
	
	private static final long serialVersionUID = 3775773460561229395L;	
}
