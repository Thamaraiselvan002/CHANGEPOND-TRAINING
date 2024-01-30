package shop;



public class Shop {

	public static void main(String[] args) {
		/*if (new Door().isLocked("qwerty")) {
			System.out.println("shop has closed");
		}
		else {
			System.out.println("shop has open");
		}

	}*/

		//default constructor
		
		/*Car C=new Car();
		System.out.println(C.run());
		
		//Parametrized constructor
		Car C1=new Car("closed","off","unseadted",50);
		System.out.println(C1.run());
		*/

		Truck truck=new Truck();
		 System.out.println("truck with default intialization");
		 System.out.println("steering:"+truck.getSteering());
		 System.out.println("engine type:"+truck.getEngine());
		 System.out.println("fuel tank capacity"+truck.getFuelTank());
		 System.out.println("no of wheels: "+truck.getWheels()+"\n");
		 
		 Truck ctruck=new Truck("diesel",4,4,65,"LED",false,"power window enable","bose","12*6");
		 System.out.println("truck with custom configuration");
		 System.out.println("steering:"+ctruck.getSteering());
		 System.out.println("engine:"+ctruck.getEngine());
		 System.out.println("fuel tank capacity"+ctruck.getFuelTank());
		 System.out.println("no of wheels:"+ctruck.getWheels());
		 System.out.println("Music system company:"+ctruck.getMusicsystems());
		
	
				
				
				
}

}
