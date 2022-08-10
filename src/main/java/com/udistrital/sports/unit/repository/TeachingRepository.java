package com.udistrital.sports.unit.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.udistrital.sports.unit.dto.teaching.TeachingPreConsultResponseDTO;
import static com.udistrital.sports.unit.util.Constants.DatabaseOperations;


@Repository
public class TeachingRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public TeachingPreConsultResponseDTO consultPreRequestParams(String nameEmployee) throws EmptyResultDataAccessException {
		return this.jdbcTemplate.queryForObject(
				DatabaseOperations.TEACHING_PRE_REQUEST,
				BeanPropertyRowMapper.newInstance(TeachingPreConsultResponseDTO.class), 
				nameEmployee
		);
	}
	
	
	
}
