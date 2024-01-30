package stringdemo;

abstract class Addr {
	String city;
	String country;
	int pincode;
	
	abstract String displayAddr() ;
//		return "city :"+ city+"country is "+ country +"pincode is ";
	
}
class CompanyAddress extends Addr{
	
	
	public CompanyAddress() {
		city="chennai";
		country="india";
		pincode=600001;
	}
	String displayAddr() {
		return "city :"+ city+ " "+"country is "+ country +" "+"pincode is " +pincode;
	}
	
/*	
class Company implements IContact{
	
	public String getcontact(String email,int mobile) {
		return "contact details of the company: "+ email+","+mobile;
	}
	
}
*/

class Address{
	public static void main(String[] args) {
		CompanyAddress com =new CompanyAddress();
		System.out.println(com.displayAddr());
//		Company C=new Company();
//		System.out.println(C.getcontact("thamaraiselvan@gmail.com", 1234567890));

		
	}
}
	
}
