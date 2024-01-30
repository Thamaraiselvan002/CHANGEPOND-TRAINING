package multithreading;

/*
 class Brackets1 implements Runnable {
	String brac;
	int times;
	
	public Brackets1(String brac,int times) {
		this.brac=brac;
		this.times=times;
	}

	@Override
	public void run() {
		for (int i=0 ;i<times;i++) {
			System.out.print(brac);
		}
	}

}
 
 public class Brackets{
	 public static void main (String[]args) {
		 Brackets1 b1=new Brackets1("[",1);
		 Brackets1 b2=new Brackets1("[",3);
		 Brackets1 b3=new Brackets1("]",3);
		 Brackets1 b4=new Brackets1("]",1);
		 b1.run();
		 b2.run();
		 b3.run();
		 b4.run();
	 }
 }

*/

class Brackets1 implements Runnable {
	

	@Override
	public void run() {
		for (int i=0 ;i<10;i++) {
			if(i<=5) {
				System.out.print("[");
			}
			else {
				System.out.print("]");
			}
			System.out.println();
		}
	}

}
 
 public class Brackets{
	public static void main(String[] args) {
		
		Brackets1 b=new Brackets1();
		Thread t1 = new Thread(b);
		t1.start();
	
		
	 }
 }