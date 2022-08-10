package com.udistrital.sports.unit.dto.employee;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.udistrital.sports.unit.model.EmployeeModel;
import com.udistrital.sports.unit.model.UserModel;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {


	private static final long serialVersionUID = -4079375113310737602L;
	
	@JsonProperty("id")
    private Integer idUser;
    private Integer idCampus;
	private String nameUser;
    private Integer idRole;

    public EmployeeDTO(){

    }

    public EmployeeDTO(UserModel userData, EmployeeModel employeeData){
        setIdUser(userData.getIdUser());
        setIdCampus(userData.getIdCampus());
        setNameUser(userData.getNameUser());
        setIdRole(employeeData.getIdRole());
    }
    
}
