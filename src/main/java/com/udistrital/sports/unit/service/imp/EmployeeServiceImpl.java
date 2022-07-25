package com.udistrital.sports.unit.service.imp;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.APIResponseDTO;
import com.udistrital.sports.unit.dto.employee.ConsultEmployeeDataRequestDTO;
import com.udistrital.sports.unit.model.EmployeeModel;
import com.udistrital.sports.unit.repository.EmployeeRepository;
import com.udistrital.sports.unit.service.EmployeeService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public APIResponseDTO<List<EmployeeModel>> getEmployees() {
		APIResponseDTO<List<EmployeeModel>> response = new APIResponseDTO<>();
		log.info("Inicia Busqueda de empleados en el sistema");
		try {
			List<EmployeeModel> data = this.employeeRepository.findAll();
			if(Objects.nonNull(data) && !data.isEmpty()) {
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
		return response;
	}

	@Override
	public APIResponseDTO<EmployeeModel> getEmployee(ConsultEmployeeDataRequestDTO request) {
		APIResponseDTO<EmployeeModel> response = new APIResponseDTO<>();
		Integer idEmployee = request.getIdUser();
		log.info("Inicia Busqueda del empleado: " + idEmployee);
		try {
			EmployeeModel data = this.employeeRepository.findById(idEmployee);
			if(Objects.nonNull(data)) {
				response.setSuccesQuery(data);
			}else {
				response.setFailQuery();
			}
		}catch(Exception e) {
			log.error("Error buscando al empleado:" + idEmployee + " en el sistema");
			log.error(e.toString());
			response.setFailQuery();
		}
		return response;
	}

	@Override
	public APIResponseDTO<EmployeeModel> registerEmployee(EmployeeModel request) {
		APIResponseDTO<EmployeeModel> response = new APIResponseDTO<>();
		Integer idEmployee = request.getIdUser();
		log.info("Inicia Busqueda del empleado: " + idEmployee);
		try {
			int databaseResponse = this.employeeRepository.save(request);
			if(databaseResponse != 1) {
				response.setFailQuery();
				response.setMessage("Información no encontrada");
			}else {
				response.setSuccesQuery(request);
				response.setMessage("Empleado registrado en el sistema");
			}
		}catch(Exception e) {
			log.error("Error buscando al empleado:" + idEmployee + " en el sistema");
			log.error(e.toString());
			response.setFailService();
		}
		return response;
	}
	
}
