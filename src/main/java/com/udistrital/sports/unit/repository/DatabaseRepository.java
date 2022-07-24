package com.udistrital.sports.unit.repository;

import java.util.List;

public interface DatabaseRepository<T,U>{
	int save(T data);
	int update(T data);
	T findById(U id);
	int deleteById(U id);
	List<T> findAll();
}
