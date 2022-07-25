package com.udistrital.sports.unit.repository;

import com.udistrital.sports.unit.model.CampusEntity;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
public class CampusRepository implements DatabaseRepository<CampusEntity, Integer>{
	
	 @Autowired
	 private JdbcTemplate jdbcTemplate;

	@Override
	public int save(CampusEntity data) {
		log.info("Insertando Informacion de la facultaa",data.toString());
		return this.jdbcTemplate.update(
			"INSERT INTO CAMPUS (IDCAMPUS, NAMECAMPUS, DIRECTIONCAMPUS) VALUES(?,?,?)",
		    new Object[] {data.getIdCampus(),data.getNameCampus(),data.getDirectionCampus()}
		);
	}

	@Override
	public int update(CampusEntity data) {
		log.info("Actualizando informacion para la facultad",data.toString());
		return this.jdbcTemplate.update(
			"UPDATE CAMPUS SET NAMECAMPUS=?,DIRECTIONCAMPUS=? WHERE IDCAMPUS=?",
			new Object[] {data.getNameCampus(),data.getDirectionCampus(),data.getIdCampus()}
		);
	}

	@Override
	public CampusEntity findById(Integer id) {
		try {
			log.info("Buscando Informacion de la facultad",id);
			return this.jdbcTemplate.queryForObject(
				"SELECT * FROM CAMPUS WHERE IDCAMPUS=?",
		         BeanPropertyRowMapper.newInstance(CampusEntity.class), 
		         id
			);
		} catch (IncorrectResultSizeDataAccessException e) {
			  log.error("Error buscando Informacion del empleado",id);
			  log.error(e.toString());
		      return null;
		}
	}


	@Override
	public List<CampusEntity> findAll() {
		try {
			return jdbcTemplate.query(
				"SELECT * from CAMPUS", 
				BeanPropertyRowMapper.newInstance(CampusEntity.class)
			);
		} catch (IncorrectResultSizeDataAccessException e) {
		      return null;
		}
	}
	

}
