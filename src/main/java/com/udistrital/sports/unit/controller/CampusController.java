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
import com.udistrital.sports.unit.dto.campus.ConsultCampusDataRequestDTO;
import com.udistrital.sports.unit.model.CampusModel;
import com.udistrital.sports.unit.service.CampusService;
import com.udistrital.sports.unit.util.Util;

@RestController
@RequestMapping(value = "/campus")
@CrossOrigin("*")
public class CampusController {
	
	@Autowired
	private CampusService campusService;
	
	@GetMapping(value="/",produces = {"application/json"})
	public ResponseEntity<List<CampusModel>> getAllCampuses(){
		APIResponseDTO<List<CampusModel>> response = new APIResponseDTO<>();
		response = campusService.getCampuses();
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-Total-Count", String.valueOf((Objects.nonNull(response.getData()))?response.getData().size():0));
		return ResponseEntity.ok()
                 .headers(headers)
                 .body(response.getData());
	}
	
	@GetMapping(value="/{idCampus}",produces = {"application/json"})
	public ResponseEntity<CampusModel> getCampus(
			@PathVariable("idCampus") Integer idCampus) {
		APIResponseDTO<CampusModel> response = new APIResponseDTO<>();

		response = campusService.getCampus(idCampus);
		return new ResponseEntity<>(response.getData(),Util.findHttpStatusResponse(response));
	}

	@PostMapping(value="/",produces = {"application/json"})
	public ResponseEntity<CampusModel> registerCampus(
			@Valid @RequestBody CampusModel request,
			BindingResult result){
		APIResponseDTO<CampusModel> response = new APIResponseDTO<>();
		if(result.hasErrors()) {
			response.setFailRequest();
			return new ResponseEntity<>(response.getData(),Util.findHttpStatusResponse(response));
		}
		response = campusService.registerCampus(request);
		return new ResponseEntity<>(response.getData(),Util.findHttpStatusResponse(response));
	}

}
