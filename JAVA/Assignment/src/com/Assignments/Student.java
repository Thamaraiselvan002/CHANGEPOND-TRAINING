package com.Assignments;

public class Student {
	private String fname;
	private String lname;
	private int java;
	private int web;
	private int database;
	
	public String getfname() {
		return fname;
	}
	
	public void setfname(String fname) {
		this.fname=fname;
	}
	
	public String getlname() {
		return lname;
	}
	public void setlname(String lname) {
		this.lname=lname;
	}
	public void setjava(int java) {
		this.java=java;
	}
	public int getjava() {
		return java;
	}
	public void setweb(int web) {
		this.web=web;
	}
	public int getweb() {
		return web;
	}
	public void setdatabase(int database) {
		this.database=database;
	}
	public int getdatabase() {
		return database;
	}
	
	public int totalMarks() {
		return java+web+database;
	}
	
	public int percentage() {
		return totalMarks()*100/300;
	}
	public void  batches() {
		if (totalMarks()>170) {
			System.out.println("platinum");
		}
		else if (totalMarks()<170 && totalMarks()>100)
		{
			System.out.println("gold");
		}
		else if ( totalMarks()>100)
		{
			System.out.println("sliver");
		}
		
	} 
	public void getstudentdetails() {
		System.out.println("fullname :"+fname+lname);
		System.out.println("java mark is :" +java);
		System.out.println("web mark is   :"+web);
		System.out.println("database mark is : "+database);
		System.out.println("total marks is :"+totalMarks());
		System.out.println("percentage :"+percentage() +"%");
		
		
	}
}
