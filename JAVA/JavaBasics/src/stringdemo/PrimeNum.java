package stringdemo;

public class PrimeNum {

		static int prime(int n) {
			if(n<=1) {
				return 0;
			}
			else {
				for(int i = 2;i<=n;i++) {
					if(n%i==0) {
						System.out.println("it is a  not prime num");
					}
						System.out.println("it is a prime num");;
				}
			}
			return 1;
		}
		
	public static void main(String[] args) {
		int n=8;
		int result=prime(n);
		System.out.println(result);
	}

}
