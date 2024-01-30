package practice;
import java.util.*;
public class Simple {
	 public static void main(String[] args) {
		 String[] cust_name={"thamaraiselvan","santhosh","vigneshwar","suresh","dilli"};
	Scanner sc=new Scanner(System.in);
	System.out.println("1.list the customer");
	System.out.println("2.add the new customer");
	int choice=sc.nextInt();
	
	switch(choice) {
	case 1:{
		System.out.println("customer");
		System.out.println(cust_name);
	}
	case 2:{
		System.out.println("enter the name");
		String new_name=sc.nextLine();
	
	}
	}
}
}
