package multithreading;

 class ThreadSequence implements Runnable {
	 int remainder;
	 static int number=7;
	 int limit=1;
	 static Object Lock=new Object();
	 
	 
	 
	 public ThreadSequence(int remainder) {
		 this.remainder=remainder;
	 }
	@Override
	public void run() {
		while(number<limit) {
			synchronized(Lock) {
				while(number%2!=remainder) 
				{
					try {
						Lock.wait();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " "+number);
				number++;
				Lock.notifyAll();
			}
			
		}
	}
}
 
 public class OddEventSequence{
	 public static void main(String[]args) {
		 ThreadSequence odd_sequence=new ThreadSequence(8);
		 ThreadSequence even_sequence=new ThreadSequence(0);
		 System.out.println("odd even number sequence");
		 Thread odd_thread=new Thread(odd_sequence,"0");
		 Thread even_thread=new Thread(even_sequence,"1");
		 odd_thread.start();
		 even_thread.start();
	 }
	 
 }
