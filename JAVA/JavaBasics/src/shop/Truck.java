package shop;

public class Truck extends Vehicle {
	private String steering;
	private String musicsystems;
	private String container;
	
	public Truck()
	{
		super();
		this.steering="power steering";
	}
	public Truck(String engine,int wheels,int seats,int fuelTank,String lights,boolean abs,String steering,String musicsystems,String container)
	{
		super( engine, wheels, seats, fuelTank, lights, abs);
		this.steering=steering;
		this.musicsystems=musicsystems;
		this.container=container;	
	}
	public String getSteering() {
		return steering;
	}
	public String getMusicsystems() {
		return musicsystems;
	}
	public String getContainer() {
		return container;
	}
}