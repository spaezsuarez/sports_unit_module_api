package com.udistrital.sports.unit.service.imp;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.APIResponseDTO;
import com.udistrital.sports.unit.model.CampusModel;
import com.udistrital.sports.unit.repository.CampusRepository;
import com.udistrital.sports.unit.service.CampusService;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CampusServiceImpl implements CampusService {

	@Autowired
	private CampusRepository campusRespository;

	@Override
	public APIResponseDTO<List<CampusModel>> getCampuses() {
		APIResponseDTO<List<CampusModel>> response = new APIResponseDTO<>();
		log.info("Inicia Busqueda de sedes en el sistema");
		try {
			List<CampusModel> data = this.campusRespository.findAll();
			if(Objects.nonNull(data)) {
				log.info("Informacion encontrada");
				response.setSuccesQuery(data);
			}else {
				log.info("Informacion no encontrada");
				response.setFailQuery();
			}
		}catch(Exception e) {
			log.error("Error listando todos los empleados del sistema");
			log.error(e.toString());
			response.setFailService();
		}
		log.info("Response: " + response.toString());
		return response;
	}

	@Override
	public APIResponseDTO<CampusModel> getCampus(Integer idCampus) {
		APIResponseDTO<CampusModel> response = new APIResponseDTO<>();
		log.info("Inicia Busqueda de la sede: " + idCampus);
		try {
			CampusModel data = this.campusRespository.findById(idCampus);
			if(Objects.nonNull(data)) {
				response.setSuccesQuery(data);
			}else {
				response.setFailQuery();
			}
		}catch(Exception e) {
			log.error("Error buscando la sede:" + idCampus + " en el sistema");
			log.error(e.toString());
			response.setFailQuery();
		}
		log.info("Response: " + response.toString());
		return response;
	}

	@Override
	public APIResponseDTO<CampusModel> registerCampus(CampusModel request) {
		APIResponseDTO<CampusModel> response = new APIResponseDTO<>();
		Integer idCampus = request.getIdCampus();
		log.info("Inicia creacion de la sede: " + idCampus);
		try {
			int databaseResponse = this.campusRespository.save(request);
			if(databaseResponse != 1) {
				response.setFailQuery();
				response.setMessage("Información no encontrada");
			}else {
				response.setSuccesQuery(request);
				response.setMessage("Empleado registrado en el sistema");
			}
		}catch(Exception e) {
			log.error("Error buscando al empleado:" + idCampus + " en el sistema");
			log.error(e.toString());
			response.setFailService();
		}
		log.info("Response: " + response.toString());
		return response;
	}

	@Override
	public APIResponseDTO<CampusModel> updateCampus(Integer idCampus, CampusModel request) {
		APIResponseDTO<CampusModel> response = new APIResponseDTO<>();
		try{
			log.info("Inicia actualizacion de datos para la sede " + idCampus);
			request.setIdCampus(idCampus);
			int dataResponse = this.campusRespository.update(request);
			if(dataResponse != 1){
				log.info("No se pudo actualizar la informacion de la sede "+idCampus);
				response.setFailQuery();
				response.setMessage("No se pudo actualizar la informacion de la sede");
			}else{
				log.info("Informacion actualizada");
				response.setSuccesQuery(request);
			}
		}catch(Exception e){
			log.error("Error buscando al empleado:" + idCampus + " en el sistema");
			log.error(e.toString());
			response.setFailService();
		}
		log.info("Response: " + response.toString());
		return response;
	}

	@Override
	public APIResponseDTO<Integer> deleteCampus(Integer idCampus) {
		APIResponseDTO<Integer> response = new APIResponseDTO<>();
		try{
			int dataResponse = this.campusRespository.delete(idCampus);
			if(dataResponse != 1){
				log.info("No se pudo eliminar la sede "+idCampus);
				response.setFailQuery();
				response.setMessage("No se pudo actualizar la informacion de la sede");
			}else{
				log.info("Sede eliminada correctamente " + idCampus);
				response.setSuccesQuery(dataResponse);
			}
		}catch(Exception e){
			log.error("Error eliminando sede " +idCampus);
			log.error(e.toString());
			response.setFailService();
		}
		return response;
	}
	
}
