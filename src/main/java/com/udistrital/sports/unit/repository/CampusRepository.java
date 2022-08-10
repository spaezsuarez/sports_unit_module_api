package com.udistrital.sports.unit.repository;

import com.udistrital.sports.unit.model.CampusModel;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
public class CampusRepository implements CrudRepository<CampusModel, Integer>{
	
	 @Autowired
	 private JdbcTemplate jdbcTemplate;

	@Override
	public int save(CampusModel data) {
		log.info("Insertando Informacion de la facultad: "+data.toString());
		return this.jdbcTemplate.update(
			"INSERT INTO \"SPORTSUNIT\".\"CAMPUS\" (IDCAMPUS, NAMECAMPUS, DIRECTIONCAMPUS) VALUES(?,?,?)",data.getIdCampus(),data.getNameCampus(),data.getDirectionCampus()
		);
	}

	@Override
	public int update(CampusModel data) {
		log.info("Actualizando informacion para la facultad: "+data.toString());
		return this.jdbcTemplate.update(
			"UPDATE \"SPORTSUNIT\".\"CAMPUS\" SET NAMECAMPUS=?,DIRECTIONCAMPUS=? WHERE IDCAMPUS=?",
			data.getNameCampus(),data.getDirectionCampus(),data.getIdCampus()
		);
	}

	@Override
	public int delete(Integer id) {
		log.info("Eliminando informacion de la facultad: " + id);
		return this.jdbcTemplate.update(
			"DELETE FROM \"SPORTSUNIT\".\"CAMPUS\" WHERE IDCAMPUS=?",
			id
		);
	}

	@Override
	public CampusModel findById(Integer id) {
		try {
			log.info("Buscando Informacion de la facultad: " + id);
			return this.jdbcTemplate.queryForObject(
				"SELECT * FROM \"SPORTSUNIT\".\"CAMPUS\" WHERE IDCAMPUS=?",
		         BeanPropertyRowMapper.newInstance(CampusModel.class),
		         id
			);
		} catch (IncorrectResultSizeDataAccessException e) {
			  log.error("Error buscando Informacion del empleado: " + id);
			  log.error(e.toString());
		      return null;
		}
	}


	@Override
	public List<CampusModel> findAll() {
		try {
			return jdbcTemplate.query(
				"SELECT * from \"SPORTSUNIT\".\"CAMPUS\"", 
				BeanPropertyRowMapper.newInstance(CampusModel.class)
			);
		} catch (IncorrectResultSizeDataAccessException e) {
		      return null;
		}
	}
}
