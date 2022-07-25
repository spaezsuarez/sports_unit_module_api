package com.udistrital.sports.unit.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.udistrital.sports.unit.model.EmployeeModel;

@Repository
public class EmployeeRepository implements DatabaseRepository<EmployeeModel, Integer> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(EmployeeModel data) {
		return this.jdbcTemplate.update("INSERT INTO EMPLOYEE (IDUSER, IDROLE) VALUES(?,?)",
				new Object[] { data.getIdUser(), data.getIdRole() });
	}

	@Override
	public int update(EmployeeModel data) {
		return this.jdbcTemplate.update(
				"UPDATE EMPLOYEE SET IDROLE=?, WHERE IDUSER=?",
				new Object[] { data.getIdRole(), data.getIdUser() }
		);
	}

	@Override
	public EmployeeModel findById(Integer id) throws IncorrectResultSizeDataAccessException {
		return this.jdbcTemplate.queryForObject("SELECT * FROM EMPLOYEE WHERE IDUSER=?",
				BeanPropertyRowMapper.newInstance(EmployeeModel.class), id);
	}

	@Override
	public List<EmployeeModel> findAll() throws IncorrectResultSizeDataAccessException {
		return jdbcTemplate.query("SELECT * FROM \"TEST\".\"EMPLOYEE\"", BeanPropertyRowMapper.newInstance(EmployeeModel.class));
	}
}
