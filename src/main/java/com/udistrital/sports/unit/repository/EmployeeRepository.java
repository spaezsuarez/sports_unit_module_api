package com.udistrital.sports.unit.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.udistrital.sports.unit.entity.EmployeeEntity;

import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class EmployeeRepository implements DatabaseRepository<EmployeeEntity, Integer> {
	
	 @Autowired
	 private JdbcTemplate jdbcTemplate;

	@Override
	public int save(EmployeeEntity data) {
		log.info("Insertando Informacion del empleado",data.toString());
		return this.jdbcTemplate.update(
			"INSERT INTO EMPLOYEE (IDUSER, IDROLE) VALUES(?,?)",
		    new Object[] {data.getIdUser(),data.getIdRole()}
		);
	}

	@Override
	public int update(EmployeeEntity data) {
		log.info("Actualizando Informacion del empleado",data.toString());
		return this.jdbcTemplate.update(
			"UPDATE EMPLOYEE SET IDROLE=?, WHERE IDUSER=?",
			new Object[] {data.getIdUser(),data.getIdRole()}
		);
	}

	@Override
	public EmployeeEntity findById(Integer id) {
		try {
			log.info("Buscando Informacion del empleado",id);
			return this.jdbcTemplate.queryForObject(
				"SELECT * FROM EMPLOYEE WHERE id=?",
		         BeanPropertyRowMapper.newInstance(EmployeeEntity.class), 
		         id
			);
		} catch (IncorrectResultSizeDataAccessException e) {
			  log.error("Error buscando Informacion del empleado",id);
			  log.error(e.toString());
		      return null;
		}
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EmployeeEntity> findAll() {
		try {
			return jdbcTemplate.query(
				"SELECT * from EMPLOYEE", 
				BeanPropertyRowMapper.newInstance(EmployeeEntity.class)
			);
		} catch (IncorrectResultSizeDataAccessException e) {
		      return null;
		}
	}
}
