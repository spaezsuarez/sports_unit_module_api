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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udistrital.sports.unit.dto.APIResponseDTO;
import com.udistrital.sports.unit.dto.employee.EmployeeDTO;
import com.udistrital.sports.unit.model.EmployeeModel;
import com.udistrital.sports.unit.service.EmployeeService;
import com.udistrital.sports.unit.util.Util;

@RestController
@RequestMapping(value = "/employee")
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value="",produces = {"application/json"})
	public ResponseEntity<List<EmployeeDTO>> getAllUsers(){
		APIResponseDTO<List<EmployeeDTO>> response = new APIResponseDTO<>();
		response = employeeService.getEmployees();
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Total-Count", String.valueOf((Objects.nonNull(response.getData()))?response.getData().size():0));
		return ResponseEntity.ok()
                 .headers(headers)
                 .body(response.getData());
	}
	
	@GetMapping(value="/{idUser}",produces = {"application/json"})
	public ResponseEntity<EmployeeDTO> getUser(@PathVariable("idUser") Integer idUser){
		APIResponseDTO<EmployeeDTO> response = new APIResponseDTO<>();
		response = employeeService.getEmployee(idUser);
		return new ResponseEntity<>(response.getData(),Util.findHttpStatusResponse(response));
	}

	@PostMapping(value="",consumes = {"application/json"},produces = {"application/json"})
	public ResponseEntity<EmployeeModel> registerUser(
			@Valid @RequestBody EmployeeDTO request,
			BindingResult result){
		APIResponseDTO<EmployeeModel> response = new APIResponseDTO<>();
		if(result.hasErrors()) {
			response.setFailRequest();
			return new ResponseEntity<>(response.getData(),Util.findHttpStatusResponse(response));
		}
		response = employeeService.registerEmployee(request);
		return new ResponseEntity<>(response.getData(),Util.findHttpStatusResponse(response));
	}

}
