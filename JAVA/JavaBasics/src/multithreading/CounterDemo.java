package multithreading;
//import static java.lang.Thread.sleep;

class Counter extends Thread{
	private int num;
	Counter(int num){
		this.num=num;	
		}
//	public void run() {
//		Counter();
//	}
	public void Counter() {
		
		for (int i=1;i<=9;i++) {
			
			try {
				sleep(500);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("the value of number is :"+ num + " -->the iteration  of : "+i);
		}
	}
	
}


public class CounterDemo {

	public static void main(String[] args) {
		Counter c1=new Counter(1);
		Counter c2=new Counter(2);
		//long startTime=System.currentTimeMillis();
		//System.out.println(startTime);
		c1.Counter();
		c2.Counter();
//		c1.Counter();
//		System.out.println("************************");
//		c2.Counter();
	}

}
