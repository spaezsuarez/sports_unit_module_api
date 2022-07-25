package com.udistrital.sports.unit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.APIResponseDTO;
import com.udistrital.sports.unit.model.RoleModel;

@Service
public interface RoleService {
	
	APIResponseDTO<List<RoleModel>> getRoles();
	APIResponseDTO<RoleModel> getRole(Integer idRole);
	APIResponseDTO<RoleModel> registerRole(RoleModel request);
	APIResponseDTO<RoleModel> updateRole(Integer idRole,RoleModel request);
	APIResponseDTO<Integer> deleteRole(Integer idRole);
}
