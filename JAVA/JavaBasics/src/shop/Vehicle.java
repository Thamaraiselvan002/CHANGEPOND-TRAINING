package shop;

public class Vehicle {
	protected String engine;
	protected int wheels;
	protected int seats;
	protected int fuelTank;
	protected String lights;
	protected boolean abs;
	
	public Vehicle()
	{
		this.engine="petrol";
		this.wheels=4;
		this.seats=4;
		this.fuelTank=1;
		this.lights="LED";
		this.abs=true;
	}
	
	public Vehicle(String engine,int wheels,int seats,int fuelTank,String lights,boolean abs)
	{
		this.engine=engine;
		this.wheels=wheels;
		this.seats=seats;
		this.fuelTank=fuelTank;
		this.lights=lights;
		this.abs=abs;
	}
	
	public String getEngine() {
		return engine;
	}
	public int getWheels() {
		return wheels;
	}
	public int getSeats() {
		return seats;
	}
	public int getFuelTank() {
		return fuelTank;
	}
	public String getLights() {
		return lights;
	}
	public boolean isAbs() {
		return abs;
	}
	
}
 
