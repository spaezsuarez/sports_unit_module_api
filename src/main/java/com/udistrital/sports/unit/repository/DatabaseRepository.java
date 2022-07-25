package com.udistrital.sports.unit.repository;

import java.util.List;

public interface DatabaseRepository<T,U>{
	int save(T data);
	int update(T data);
	int delete(U id);
	T findById(U id);
	List<T> findAll();
}
