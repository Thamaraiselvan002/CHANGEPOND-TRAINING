package com.javabasics;

public class Employee {

	private String fname;
	private String lname;
	private boolean isMarried;
	private int empid;
	public int yob;
	private boolean isAdult;
	
	private int calage() {
		return 2023-yob;
	}
	
	public boolean checkAdult() {
		if(calage()>18) {
			isAdult=true;
		}
		else {
			isAdult=false;
		}
		return isAdult;
	}
	
	public String getfname() {
		return fname;
	}
	
	public void setfname (String fname) {
		this.fname=fname;
	}
	
	public String getlname() {
		return lname;
	}
	
	public void setlname (String  lname) {
		this.lname=lname;
	}
	
	public boolean getboolean() {
		return isMarried;
	}
	
	
	public void setboolean (boolean isMarried) {
		this.isMarried=isMarried;
	}
	
	public int  getempid() {
		return empid;
	}
	
	
	public void setempid (int empid) {
		this.empid=empid;
	}
	
	public void getEmployedetails() {
		System.out.println("fullname :"+fname+lname);
		System.out.println("is married: "+isMarried);
		System.out.println("empid  :"+empid);
		
	}
	
	
	 /*public void getEmpDetails() {
		System.out.println("full name "+this.fname+ " " +this.lname);
		System.out.println("emp id "+this.empid);
		System.out.println("gender "+this.isMarried);
	}*/
}
