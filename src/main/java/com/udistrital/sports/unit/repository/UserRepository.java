package com.udistrital.sports.unit.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.udistrital.sports.unit.model.UserModel;

@Repository
public class UserRepository implements DatabaseRepository<UserModel,Integer> {

    @Autowired
	private JdbcTemplate jdbcTemplate;

    @Override
    public int save(UserModel data) {
        return this.jdbcTemplate.update("INSERT INTO \"SPORTSUNIT\".\"USER\" (IDUSER,IDCAMPUS,NAMEUSER) VALUES(?,?,?)",
				new Object[] { data.getIdUser(), data.getIdCampus(),data.getNameUser() });
    }

    @Override
    public int update(UserModel data) {
        return this.jdbcTemplate.update(
				"UPDATE \"SPORTSUNIT\".\"USER\" SET IDCAMPUS=?, NAMEUSER=? WHERE IDUSER=?",
				new Object[] { data.getIdCampus(),data.getNameUser(), data.getIdUser() }
		);
    }

    @Override
	public int delete(Integer id) {
		return this.jdbcTemplate.update(
			"DELETE FROM \"SPORTSUNIT\".\"USER\" WHERE IDUSER=?",
			new Object[] {id}
		);
	}

    @Override
    public UserModel findById(Integer id) throws IncorrectResultSizeDataAccessException {
        return this.jdbcTemplate.queryForObject("SELECT * FROM \"SPORTSUNIT\".\"USER\" WHERE IDUSER=?",
				BeanPropertyRowMapper.newInstance(UserModel.class), id);
    }

    @Override
    public List<UserModel> findAll() throws IncorrectResultSizeDataAccessException {
        return jdbcTemplate.query("SELECT * FROM \"SPORTSUNIT\".\"USER\"", BeanPropertyRowMapper.newInstance(UserModel.class));
    }
    
}
