package com.udistrital.sports.unit.dto;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ServiceResponse<T> implements Serializable {
	
	private T data;
	private HttpStatus statusHttp;
	
	private static final long serialVersionUID = -4797030399745684780L;

}
