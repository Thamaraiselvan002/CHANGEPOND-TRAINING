package shop;

public class Bike extends Vehicle{
	public String handle;
	
	public Bike()
	{
		super();
		this.handle="short";
	}
	
	
	public Bike(String engine,int wheels,int seats,int fuelTank,String lights,boolean abs,String handle)
	{
		super( engine, wheels, seats, fuelTank, lights, abs);
		this.handle=handle;
	}
	
	public String getHandle()
	{
		return handle;
	}
}