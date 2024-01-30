package exceptions;

//import java.io.*;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
//		int a1=10/0;
//		System.out.println(a1); 
		

		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the num:");
			int num=sc.nextInt();
			int n=num/(num+num);
			System.out.println(n);
			sc.close();
			//System.exit(0);  //ans  is crct means didnt execute finally bblock
		}
		catch(ArithmeticException E) {
			System.out.println("arithmetic exceptions" +E.getMessage());
		}
		catch(RuntimeException cs) {
			System.out.println("run time exceptions "+ cs.getMessage());
		}
//		catch(NullPointerException s) {
//			System.out.println("null pointer exception "+ s.getMessage());
//			
//		}
		finally {
			System.out.println("inside finally");
		}
	
	}
}


