package com.udistrital.sports.unit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.APIResponseDTO;
import com.udistrital.sports.unit.dto.employee.ConsultEmployeeDataRequestDTO;
import com.udistrital.sports.unit.model.EmployeeModel;

@Service
public interface EmployeeService {
	
	APIResponseDTO<List<EmployeeModel>> getEmployees();
	APIResponseDTO<EmployeeModel> getEmployee(ConsultEmployeeDataRequestDTO request);
	APIResponseDTO<EmployeeModel> registerEmployee(EmployeeModel request);

}
