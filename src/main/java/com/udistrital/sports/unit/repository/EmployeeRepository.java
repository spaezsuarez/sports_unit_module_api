package com.udistrital.sports.unit.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.udistrital.sports.unit.model.EmployeeModel;

@Repository
public class EmployeeRepository implements CrudRepository<EmployeeModel, Integer> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(EmployeeModel data) {
		return this.jdbcTemplate.update("INSERT INTO \"SPORTSUNIT\".\"EMPLOYEE\" (IDUSER, IDROLE) VALUES(?,?)",data.getIdUser(), data.getIdRole());
	}

	@Override
	public int update(EmployeeModel data) {
		return this.jdbcTemplate.update("UPDATE \"SPORTSUNIT\".\"EMPLOYEE\" SET IDROLE=? WHERE IDUSER=?", data.getIdRole(), data.getIdUser());
	}

	@Override
	public int delete(Integer id) {
		return this.jdbcTemplate.update(
			"DELETE FROM \"SPORTSUNIT\".\"EMPLOYEE\" WHERE IDUSER=?", id);
	}

	@Override
	public EmployeeModel findById(Integer id) throws IncorrectResultSizeDataAccessException {
		return this.jdbcTemplate.queryForObject("SELECT * FROM \"SPORTSUNIT\".\"EMPLOYEE\" WHERE IDUSER=?",
				BeanPropertyRowMapper.newInstance(EmployeeModel.class), id);
	}

	@Override
	public List<EmployeeModel> findAll() throws IncorrectResultSizeDataAccessException {
		return jdbcTemplate.query("SELECT * FROM \"SPORTSUNIT\".\"EMPLOYEE\"", BeanPropertyRowMapper.newInstance(EmployeeModel.class));
	}
}
