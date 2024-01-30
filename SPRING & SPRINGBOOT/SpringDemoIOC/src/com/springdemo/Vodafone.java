package com.springdemo;

public class Vodafone implements Sim{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using Vodafone SIM");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
	System.out.println("Browsing Data Using Vodafonne SIM");	
	}

}