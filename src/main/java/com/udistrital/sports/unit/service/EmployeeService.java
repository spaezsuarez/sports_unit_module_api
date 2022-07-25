package com.udistrital.sports.unit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.APIResponseDTO;
import com.udistrital.sports.unit.dto.employee.EmployeeDTO;
import com.udistrital.sports.unit.model.EmployeeModel;

@Service
public interface EmployeeService {
	
	APIResponseDTO<List<EmployeeDTO>> getEmployees();
	APIResponseDTO<EmployeeDTO> getEmployee(Integer idUser);
	APIResponseDTO<EmployeeModel> registerEmployee(EmployeeDTO request);

}
