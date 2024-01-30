package com.springdependency;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vechicle {
	public void Drive() {
		System.out.println("Driving a car");
	}
}
