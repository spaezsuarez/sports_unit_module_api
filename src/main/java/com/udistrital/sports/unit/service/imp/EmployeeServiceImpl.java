package com.udistrital.sports.unit.service.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.udistrital.sports.unit.dto.APIResponseDTO;
import com.udistrital.sports.unit.dto.employee.EmployeeDTO;
import com.udistrital.sports.unit.model.EmployeeModel;
import com.udistrital.sports.unit.model.UserModel;
import com.udistrital.sports.unit.repository.EmployeeRepository;
import com.udistrital.sports.unit.repository.UserRepository;
import com.udistrital.sports.unit.service.EmployeeService;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public APIResponseDTO<List<EmployeeDTO>> getEmployees() {
		APIResponseDTO<List<EmployeeDTO>> response = new APIResponseDTO<>();
		log.info("Inicia Busqueda de empleados en el sistema");
		try {
			List<EmployeeModel> employeeData = this.employeeRepository.findAll();
			List<UserModel> userData = this.userRepository.findAll();
			List<EmployeeDTO> data = new ArrayList<>();
			
			if(Objects.nonNull(employeeData) && Objects.nonNull(userData)){
				for(int i = 0; i < employeeData.size(); i++){
					data.add(new EmployeeDTO(userData.get(i),employeeData.get(i)));
				}
				if(Objects.nonNull(data)) {
					log.info("Informacion encontrada");
					response.setSuccesQuery(data);
				}else {
					log.info("Informacion no encontrada");
					response.setFailQuery();
				}
			}
		}catch(Exception e) {
			log.error("Error listando todos los empleados del sistema");
			log.error(e.toString());
			response.setFailService();
		}
		log.info("Response: "+response.toString());
		return response;
	}

	@Override
	public APIResponseDTO<EmployeeDTO> getEmployee(Integer idUser) {
		APIResponseDTO<EmployeeDTO> response = new APIResponseDTO<>();
		log.info("Inicia Busqueda del empleado: " + idUser);
		try {
			UserModel userData = this.userRepository.findById(idUser);
			EmployeeModel employeeData = this.employeeRepository.findById(idUser);
			EmployeeDTO data = new EmployeeDTO(userData, employeeData);
			
			if(Objects.nonNull(data)) {
				log.info("Usuario encontrado");
				response.setSuccesQuery(data);
			}else {
				log.info("Usuario no encontrado");
				response.setFailQuery();
			}
		}catch(Exception e) {
			log.error("Error buscando al empleado:" + idUser + " en el sistema");
			log.error(e.toString());
			response.setFailQuery();
		}
		log.info("Response: "+response.toString());
		return response;
	}

	@Override
	public APIResponseDTO<EmployeeModel> registerEmployee(EmployeeDTO request) {
		APIResponseDTO<EmployeeModel> response = new APIResponseDTO<>();
		Integer idEmployee = request.getIdUser();
		log.info("Inicia Busqueda del empleado: " + idEmployee);
		try {
			EmployeeModel dataEmployee = new EmployeeModel(request);
			UserModel dataUser = new UserModel(request);

			int userDatabaseResponse = this.userRepository.save(dataUser);

			if(userDatabaseResponse != 1){
				log.info("No se pudo crear el usuario");
				response.setFailQuery();
				response.setMessage("No se pudo crear el usuario");
				return response;
			}

			int employeeDatabaseResponse = this.employeeRepository.save(dataEmployee);
			
			if(employeeDatabaseResponse != 1) {
				log.info("No se pudo crear el empleado");
				response.setFailQuery();
				response.setMessage("No se pudo crear el empleado");
			}else {
				log.info("Empleado creado exitosamente");
				response.setSuccesQuery(dataEmployee);
				response.setMessage("Empleado registrado en el sistema");
			}
		}catch(Exception e) {
			log.error("Error buscando al empleado:" + idEmployee + " en el sistema");
			log.error(e.toString());
			response.setFailService();
		}

		log.info("Response: "+response.toString());
		return response;
	}
	
}
