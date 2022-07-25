package com.udistrital.sports.unit.repository;

import com.udistrital.sports.unit.model.RoleModel;
import com.udistrital.sports.unit.model.RoleModel;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Log4j2
public class RoleRepository implements DatabaseRepository<RoleModel, Integer>{
	
	 @Autowired
	 private JdbcTemplate jdbcTemplate;

	@Override
	public int save(RoleModel data) {
		log.info("Insertando Informacion del rol",data.toString());
		return this.jdbcTemplate.update(
			"INSERT INTO \"SPORTSUNIT\".\"ROLE\" (IDROLE, NAMEROLE) VALUES(?,?)",
		    new Object[] {data.getIdRole(),data.getNameRole()}
		);
	}

	@Override
	public int update(RoleModel data) {
		log.info("Actualizando informacion para el rol",data.toString());
		return this.jdbcTemplate.update(
			"UPDATE \"SPORTSUNIT\".\"ROLE\" SET NAMEROLE=? WHERE IDROLE=?",
			new Object[] {data.getNameRole(),data.getIdRole()}
		);
	}

	@Override
	public RoleModel findById(Integer id) {
		try {
			log.info("Buscando Informacion de la facultad",id);
			return this.jdbcTemplate.queryForObject(
				"SELECT * FROM \"SPORTSUNIT\".\"ROLE\" WHERE IDROLE=?",
		         BeanPropertyRowMapper.newInstance(RoleModel.class), 
		         id
			);
		} catch (IncorrectResultSizeDataAccessException e) {
			  log.error("Error buscando Informacion del empleado",id);
			  log.error(e.toString());
		      return null;
		}
	}


	@Override
	public List<RoleModel> findAll() {
		try {
			return jdbcTemplate.query(
				"SELECT * from \"SPORTSUNIT\".\"ROLE\"", 
				BeanPropertyRowMapper.newInstance(RoleModel.class)
			);
		} catch (IncorrectResultSizeDataAccessException e) {
		      return null;
		}
	}
	

}
