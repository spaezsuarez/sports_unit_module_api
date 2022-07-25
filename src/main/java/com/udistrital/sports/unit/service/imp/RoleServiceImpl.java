package com.udistrital.sports.unit.service.imp;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.APIResponseDTO;
import com.udistrital.sports.unit.model.RoleModel;
import com.udistrital.sports.unit.repository.RoleRepository;
import com.udistrital.sports.unit.service.RoleService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public APIResponseDTO<List<RoleModel>> getRoles() {
		APIResponseDTO<List<RoleModel>> response = new APIResponseDTO<>();
		log.info("Inicia Busqueda de roles en el sistema");
		try {
			List<RoleModel> data = this.roleRepository.findAll();
			if(Objects.nonNull(data)) {
				log.info("Informacion encontrada");
				response.setSuccesQuery(data);
			}else {
				log.info("Informacion no encontrada");
				response.setFailQuery();
			}
		}catch(Exception e) {
			log.error("Error listando todos los roles del sistema");
			log.error(e.toString());
			response.setFailService();
		}
		log.info("Response: "+response.toString());
		return response;
	}

	@Override
	public APIResponseDTO<RoleModel> getRole(Integer idRole) {
		APIResponseDTO<RoleModel> response = new APIResponseDTO<>();
		log.info("Inicia Busqueda del role: " + idRole);
		try {
			RoleModel data = this.roleRepository.findById(idRole);
			if(Objects.nonNull(data)) {
				response.setSuccesQuery(data);
			}else {
				response.setFailQuery();
			}
		}catch(Exception e) {
			log.error("Error buscando el role: " + idRole + " en el sistema");
			log.error(e.toString());
			response.setFailQuery();
		}
		log.info("Response: "+response.toString());
		return response;
	}

	@Override
	public APIResponseDTO<RoleModel> registerRole(RoleModel request) {
		APIResponseDTO<RoleModel> response = new APIResponseDTO<>();
		Integer idRole = request.getIdRole();
		log.info("Inicia creación del role con id: " + idRole);
		try {
			int databaseResponse = this.roleRepository.save(request);
			if(databaseResponse != 1) {
				response.setFailQuery();
				response.setMessage("No se pudo insertar la información");
			}else {
				response.setSuccesQuery(request);
				response.setMessage("Role registrado en el sistema");
			}
		}catch(Exception e) {
			log.error("Error del sistema a la hora de crear el role: " + idRole);
			log.error(e.toString());
			response.setFailService();
		}
		log.info("Response: "+response.toString());
		return response;
	}
}
