package com.udistrital.sports.unit.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.udistrital.sports.unit.dto.lending.LendingResponseDTO;
import com.udistrital.sports.unit.util.Constants.DatabaseOperations;

import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class LendingElementsRepository {

    @Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<LendingResponseDTO> consultAvaibleLendingElements(String idSport, String idSpace) {

		log.info("{} - {}", idSport, idSpace);

		return this.jdbcTemplate.query(
				DatabaseOperations.TEACHING_ELEMENTS_QUERY,
				BeanPropertyRowMapper.newInstance(LendingResponseDTO.class), 
				idSport,
                idSpace
		);
	}

}
