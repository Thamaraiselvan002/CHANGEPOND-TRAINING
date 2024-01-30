package com.app.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.controller.model.UserRest;


@RestController
@RequestMapping ("/user")
public class UserControlleR {

	
	/*
	 * @GetMapping (path="/{firstname}/{lastname}") public String
	 * getuser(@PathVariable String firstname,@PathVariable String lastname) {
	 * return "get user called = " +firstname +" "+ lastname;
	 * 
	 * }
	 */
	/*
	 * @GetMapping public String getUser(@RequestParam
	 * (value="page",defaultValue="1") int page,@RequestParam
	 * (value="limit",defaultValue="60") int limit,
	 * 
	 * @RequestParam (value="sort",defaultValue="desc",required=false)String sort) {
	 * return "get user was called with Page= "+page+" limit="+limit+" sort="+sort;
	 * 
	 * }
	 */
	
	
	@PutMapping
	public String updateuser() {
		return "update user called";
		
	}
	
	@PostMapping
	public String createuser() {
		return "create user called";
		
	}
	
	@DeleteMapping
	public String deleteuser() {
		return "delete  user called";
		
	}
	
	@GetMapping(path="{a}",produces= {MediaType.APPLICATION_JSON_VALUE})
	public UserRest getuser(@PathVariable String a)
	{
		UserRest result =new UserRest();
		result.setFirstname("thamaraiselvan");
		result.setLastname("s");
		result.setEmail("hguiygugy@ghfytfuy");
		return result;
	}
}
