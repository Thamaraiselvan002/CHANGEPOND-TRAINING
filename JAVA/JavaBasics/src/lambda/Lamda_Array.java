package lambda;
import java.util.*;



public class Lamda_Array {
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList <Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.forEach(n-> {
		System.out.println(n);
		});
		
		list.forEach(n-> {
			System.out.println(n);
			System.out.println("-----------------------");
			if(n>5 && n==4) {
				System.out.println(n);
			}
			});
			
	}
		
		
		
}

