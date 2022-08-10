package com.udistrital.sports.unit.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.udistrital.sports.unit.dto.teaching.TeachingElementsQueryResponseDTO;
import com.udistrital.sports.unit.dto.teaching.TeachingPreQueryResponseDTO;
import com.udistrital.sports.unit.dto.teaching.TeachingSpaceQueryResponseDTO;

import lombok.extern.log4j.Log4j2;

import static com.udistrital.sports.unit.util.Constants.DatabaseOperations;

import java.util.List;


@Repository
@Log4j2
public class TeachingRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public TeachingPreQueryResponseDTO consultPreRequestParams(String nameEmployee) throws EmptyResultDataAccessException {
		return this.jdbcTemplate.queryForObject(
				DatabaseOperations.TEACHING_PRE_REQUEST,
				BeanPropertyRowMapper.newInstance(TeachingPreQueryResponseDTO.class), 
				nameEmployee
		);
	}
	
	public TeachingSpaceQueryResponseDTO consultSpace(String idEmployee) {
		return this.jdbcTemplate.queryForObject(
				DatabaseOperations.TEACHING_CAMPUS_SPORT,
				BeanPropertyRowMapper.newInstance(TeachingSpaceQueryResponseDTO.class),
				idEmployee
		);
	}
	
	public List<TeachingElementsQueryResponseDTO> consultElementsBySpace(String idSport,String spaceCode) {
		log.info("IdSport: " + idSport);
		log.info("spaceCode: " + spaceCode);
		return this.jdbcTemplate.query(
				DatabaseOperations.TEACHING_ELEMENTS_QUERY,
				BeanPropertyRowMapper.newInstance(TeachingElementsQueryResponseDTO.class),
				idSport,
				spaceCode
		);
	}
	
	
	
}
