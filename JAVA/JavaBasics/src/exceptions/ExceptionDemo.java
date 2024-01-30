package exceptions;
import java.io.*;
public class ExceptionDemo {

	
	
		private int[]list= {10,23,45,67,89};
		public void writerlist() {
			
			PrintWriter out=null;
			try {
				System.out.println("try statement");
				out =new PrintWriter(new FileWriter("outfile.txt"));
				for (int i=1;i<7;i++) {
					out.println("value at : "+(i+1) +"= "+list[i]);
				}
			}
			catch(Exception e) {
				System.out.println(("Exception =>" +e.getMessage()));
			}
			finally {
				if(out!=null) {
					System.out.println("closing the printwriter");
					out.close();
				}
				else {
					System.out.println("opening the printwriter");
				}
			}
		}
		

	public static void main(String[] args) {
		
		ExceptionDemo ep=new ExceptionDemo();
		ep.writerlist();
	}

}
