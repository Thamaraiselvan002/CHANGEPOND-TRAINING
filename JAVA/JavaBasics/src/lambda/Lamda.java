package lambda;

interface lamdafun{
	public void mark(int x ,int y);
}

public class Lamda{
	public static void main(String[] args) {
		lamdafun lam=(int x,int y)->{
			System.out.println("KKK");
			System.out.println(y*x);
		};
		lam.mark(3,8);
	}
}