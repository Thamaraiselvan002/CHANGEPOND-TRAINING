package shop;

public class Car {
private String doors;
private String engine;
private String driver;
private int speed;



//default constructor
public Car() {
	doors="closed";
	engine="on";
	driver="seadted";
	speed=90;
}



//Parametrized constructor
public Car(String d,String engine,String driver,int speed) {
	doors=d;
	this.engine=engine;
	this.driver=driver;
	this.speed=speed;
}




public String run() {
	if (doors.equals("closed") && engine.equals("on") && driver.equals("seadted") && speed>0) {
		return"car is running";
	}
		else {
			return "car is stop";
		}
	}
}


