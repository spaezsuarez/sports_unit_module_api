package com.udistrital.sports.unit.controller;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udistrital.sports.unit.dto.APIResponseDTO;
import com.udistrital.sports.unit.dto.employee.ConsultEmployeeDataRequestDTO;
import com.udistrital.sports.unit.model.EmployeeModel;
import com.udistrital.sports.unit.service.EmployeeService;
import com.udistrital.sports.unit.util.Util;

@RestController
@RequestMapping(value = "/employee")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value="/all",produces = {"application/json"})
	public ResponseEntity<APIResponseDTO<List<EmployeeModel>>> getAllUsers(){
		APIResponseDTO<List<EmployeeModel>> response = new APIResponseDTO<>();
		response = employeeService.getEmployees();
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Total-Count", String.valueOf((Objects.nonNull(response.getData()))?response.getData().size():0));
		return ResponseEntity.ok()
                 .headers(headers)
                 .body(response);
	}
	
	@GetMapping(value="/get",produces = {"application/json"})
	public ResponseEntity<APIResponseDTO<EmployeeModel>> getUser(
			@Valid @RequestBody ConsultEmployeeDataRequestDTO request,
			BindingResult result){
		APIResponseDTO<EmployeeModel> response = new APIResponseDTO<>();
		if(result.hasErrors()) {
			response.setFailRequest();
			return new ResponseEntity<>(response,Util.findHttpStatusResponse(response));
		}
		response = employeeService.getEmployee(request);
		return new ResponseEntity<>(response,Util.findHttpStatusResponse(response));
	}

}
