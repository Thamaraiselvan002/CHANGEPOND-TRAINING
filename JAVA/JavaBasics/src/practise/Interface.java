package practise;

 interface Father {
	abstract void CheckIn();
	abstract void CheckOut();
}

interface  Mother{
	void CheckIn();
	void CheckOut();
}

 class Son implements Father,Mother {
	public void CheckIn() {
		System.out.println("efgh");
	}
	
	public void CheckOut() {
		System.out.println("abcd");
	}
	
	public static void main(String[]args) {
		Son S=new Son();
		S.CheckIn();
		S.CheckOut();
	}
}

