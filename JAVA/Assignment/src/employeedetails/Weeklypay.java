package employeedetails;

public class Weeklypay extends Employee {

	public int week_pay;
	public int weekly_work;
	
	
	public Weeklypay(String name, String title, String company, String department ,int weekly_work, int week_pay) {
		super(name, title, company, department);
		this.week_pay=week_pay;
		this.weekly_work=weekly_work;
	
	}



	public void getdetails() {
		
		super.getdetails();
		System.out.println( "week_pay : "+week_pay);
		System.out.println( "weekly worked :"+weekly_work);
		System.out.println("total sal: "+calpay());
	}
	public int  calpay() {
		return week_pay*weekly_work;
	}
}
