package multithreading;
import java.util.Random;
 class Icounter1 implements Runnable {
	 private int num;
	 
	 public Icounter1(int num) {
		 this.num=num;
	 }
	@Override
	public void run() {
		Random random =new Random();
		for(int i=0;i<7;i++){
			try {
				Thread.sleep(random.nextInt(200));
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("the value of threa number is :"+num+" the iteration of theread is : "+i);
		}
	}

}
 
 public class Icounter{
	 public static void main(String[]args) {
		 Thread t1=new Thread();
		 Icounter1 c=new Icounter1(1);
		 Icounter1 c1=new Icounter1(2);
		 c.run();
		 c1.run();
	 }
 }
