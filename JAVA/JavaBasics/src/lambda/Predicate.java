package lambda;
import java.util.function.IntPredicate;
public class Predicate {

	public static void main(String[] args) {
		IntPredicate a=tham-> tham< 18 ;
			System.out.println( a.test(20) );
		IntPredicate a1=tham-> tham> 18 ;
			System.out.println( a1.test(20) );
		IntPredicate leap1= y-> y%4==0;
		IntPredicate leap2=y->y%400==0;
		IntPredicate leap3=y->y%100!=0;
		System.out.println((leap1).and(leap3).or(leap2).test(1900));
	}

}
