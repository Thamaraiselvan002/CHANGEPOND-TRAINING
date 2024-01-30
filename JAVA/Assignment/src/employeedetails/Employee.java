package employeedetails;

public class Employee {
	protected String name;
	protected String title;
	protected String company;
	protected String department;
	
	public Employee(String name,String title, String company,String department) {
		this.name=name;
		this.title=title;
		this.company=company;
		this.department=department;
	}

	

	public void getdetails() {
		
		System.out.println( "name of emp: " +name);
		System.out.println( "name of title:" +title);
		System.out.println( "name of company:"+company);
		System.out.println("name of dept:" +department );
	}
	
	public static void main(String[] args) {
		Employee emp=new Hourlyemp("thamaraiselvan", "engineer", "changepond", "java", 200, 3);
		emp.getdetails();
		System.out.println("<--------------->");
		emp=new Weeklypay("thamaraiselvan", "engineer", "changepond", "java", 3, 300);
		emp.getdetails();
		
	}
}


