package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.model.Ailen;

@Repository
public interface Repo extends JpaRepository<Ailen, Integer>  {
	
	@Query(value = "select a from Alian a")
	public Iterable<Ailen> getAliens();

	
	@Query(value = "select a from Alian a")
	public Iterable<Ailen> getCourses();
}
