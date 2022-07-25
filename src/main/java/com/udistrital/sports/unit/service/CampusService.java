package com.udistrital.sports.unit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.APIResponseDTO;
import com.udistrital.sports.unit.model.CampusModel;

@Service
public interface CampusService {
	
	APIResponseDTO<List<CampusModel>> getCampuses();
	APIResponseDTO<CampusModel> getCampus(Integer idCampus);
	APIResponseDTO<CampusModel> registerCampus(CampusModel request);
	APIResponseDTO<CampusModel> updateCampus(Integer idCampus,CampusModel request);
	APIResponseDTO<Integer> deleteCampus(Integer idCampus);	
}
