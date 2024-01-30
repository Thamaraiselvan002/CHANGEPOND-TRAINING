package employeedetails;

public class Hourlyemp extends Employee{
	public int hourly_pay;
	public int hourly_work;
	
	public Hourlyemp(String name,String title, String company,String department,int hourly_pay,int hourly_work)
	{
		super(name,title,company,department);
		this.hourly_pay=hourly_pay;
		this.hourly_work=hourly_work;
	}


public void getdetails() {
	
	super.getdetails();
	System.out.println( "hourly_pay : "+hourly_pay);
	System.out.println( "hourly worked :"+hourly_work);
	System.out.println("total sal: "+calpay());
}

	public int  calpay() {
		return hourly_pay*hourly_work;
	}
}
