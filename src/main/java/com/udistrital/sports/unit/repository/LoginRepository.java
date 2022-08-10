package com.udistrital.sports.unit.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.udistrital.sports.unit.dto.login.LoginAuxiliarResponseDTO;

import static com.udistrital.sports.unit.util.Constants.DatabaseOperations;

import java.util.List;

@Repository
public class LoginRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<LoginAuxiliarResponseDTO> loginAuxiliar(String codeEmployee) throws Exception {
		return this.jdbcTemplate.query(DatabaseOperations.LOGIN_AUXILIAR,
				BeanPropertyRowMapper.newInstance(LoginAuxiliarResponseDTO.class), codeEmployee);
	}
	

}
