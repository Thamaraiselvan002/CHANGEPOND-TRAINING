package practise;

abstract class Computer{
		abstract void TurnOn() ;
	}

	abstract class Mobile{
		void TurnOff() {
			System.out.println("turning off");
		}
	}

	class Cellphone extends Computer{
		void TurnOn() {
			System.out.println("turn on");
		}
	}
	class Calculator{
		public static void main (String[]args) {
			Cellphone C=new Cellphone();
			C.TurnOn();
		}
	}

