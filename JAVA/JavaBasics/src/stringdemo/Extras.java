package stringdemo;

public class Extras {
	
	 static int factorial(int n) {
		if (n!=0) {
			return n*factorial(n-2);
		}
		else {
			return 1;
		}
	}
	public static void main(String[] args) {
		int n=7,result;
		result=factorial(n);
		System.out.println(result);
		
	}

}
