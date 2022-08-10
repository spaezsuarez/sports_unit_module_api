package com.udistrital.sports.unit.dto.lending;

import java.io.Serializable;

import lombok.Data;

@Data
public class LendingResponseDTO implements Serializable {

    private String idElement;
	private String typeElement;
	private String element;
	private String state;

    private static final long serialVersionUID = -5476997264883696757L;
    
}
