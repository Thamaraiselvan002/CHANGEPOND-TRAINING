package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dao.Repo;
import com.app.model.Ailen;

@Controller
@RequestMapping("/alien")
public class AlienController {
	
@Autowired
private Repo repo;

	@GetMapping("/allAlien")
	public Iterable<Ailen> index() {
		return repo.getAliens();
	}
	
	
	

	@GetMapping("/couses")
	public Iterable<Ailen> index2() {
		return repo.getCourses();
	}
	
}
