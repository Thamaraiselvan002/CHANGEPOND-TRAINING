package collectiondemo;
import java.util.*;
import java.util.ArrayList;
public class ArrayListDemo {

	public  void CreatedList() {
		List <Integer> scores=new ArrayList<>();
		scores.add(4);
		scores.add(5);
		scores.add(6);
		scores.add(7); 
		scores.add(8);
		System.out.println("scores are  : "+ scores);
		System.out.println("the last score is   : "+ scores.get(4));
		System.out.println("scores are  : "+ scores.remove(2));
		System.out.println("scores are  : "+ scores);
		System.out.println("scores are  : "+ scores.add(9));
	}
		
}
