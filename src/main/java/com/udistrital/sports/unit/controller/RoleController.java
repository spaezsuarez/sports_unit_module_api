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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udistrital.sports.unit.dto.APIResponseDTO;
import com.udistrital.sports.unit.dto.role.ConsultRoleDataRequestDTO;
import com.udistrital.sports.unit.model.RoleModel;
import com.udistrital.sports.unit.service.RoleService;
import com.udistrital.sports.unit.util.Util;

@RestController
@RequestMapping(value = "/role")
@CrossOrigin("*")
public class RoleController {
	
	@Autowired
	private RoleService RoleService;
	
	@GetMapping(value="/all",produces = {"application/json"})
	public ResponseEntity<List<RoleModel>> getAllRolees(){
		APIResponseDTO<List<RoleModel>> response = new APIResponseDTO<>();
		response = RoleService.getRoles();
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Total-Count", String.valueOf((Objects.nonNull(response.getData()))?response.getData().size():0));
		return ResponseEntity.ok()
                 .headers(headers)
                 .body(response.getData());
	}
	
	@GetMapping(value="/get",produces = {"application/json"})
	public ResponseEntity<RoleModel> getRole(
			@Valid @RequestBody ConsultRoleDataRequestDTO request,
			BindingResult result){
		APIResponseDTO<RoleModel> response = new APIResponseDTO<>();
		if(result.hasErrors()) {
			response.setFailRequest();
			return new ResponseEntity<>(response.getData(),Util.findHttpStatusResponse(response));
		}
		response = RoleService.getRole(request);
		return new ResponseEntity<>(response.getData(),Util.findHttpStatusResponse(response));
	}

	@PostMapping(value="/register",produces = {"application/json"})
	public ResponseEntity<RoleModel> registerRole(
			@Valid @RequestBody RoleModel request,
			BindingResult result){
		APIResponseDTO<RoleModel> response = new APIResponseDTO<>();
		if(result.hasErrors()) {
			response.setFailRequest();
			return new ResponseEntity<>(response.getData(),Util.findHttpStatusResponse(response));
		}
		response = RoleService.registerRole(request);
		return new ResponseEntity<>(response.getData(),Util.findHttpStatusResponse(response));
	}

}
