package employee;
import java.util.*;
public class Ticket {
	
	 static Queue <String> confirm_ticket= new LinkedList<String>();
	static Queue <String> waiting_ticket=new LinkedList<String>();
	static Queue <String> booked_tickets=new LinkedList<String>();
	
	 private static final int maxConformedTickets= 10;
	
	private static List<String> employee_name = Arrays.asList(

            "thams", "partha", "Vicky", "Bala", "sandy", "sivanesan", "santhosh",

            "sathya", "Bravo", "ulaganadhan", "yuvaraj", "dola", "kishore", "Muthu", "Anandhu");
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 boolean continue_loop=true;
		 while(continue_loop) {
			 System.out.println("\n1.list the employee,\n2.ticket booking,\n3.waiting ticket,\n4.confirm tickets,\n5.Booked tickets,\n.6 Exit");
			 System.out.println("Enter your choice");
			 int choice=sc.nextInt();
			 switch(choice) 
			 {
			 case 1:
				 listEmployee();
				 break;
			 case 2:
				 listEmployee();
				 ticketBooking();
				 break;
		 }
		 
		 }
	 }
	
	public static void listEmployee() {
		System.out.println("list of the employee");
		 int count=1;
		 for(String a:employee_name) {
			 System.out.println(count+"."+a);
			 count++;
		 }
	}
	

	 public static void ticketBooking() {
		 Scanner sc=new Scanner(System.in);
		 try {
			 System.out.println("train ticket booking");
			 System.out.println("enter your name: ");
			 String t_name=sc.next();
			 if (employee_name.contains(t_name) ) 
			 {
				 if(!booked_tickets.contains(t_name))
				 {
					
					 if(confirm_ticket.size()<maxConformedTickets)
					 {
						 System.out.println("your ticket is confirmed");
						 confirm_ticket.offer(t_name);
						 booked_tickets.offer(t_name);
					 }
					 else {
						 System.out.println("your waiting list");
						 waiting_ticket.offer(t_name);
						 booked_tickets.offer(t_name);
					 }
				 }
				 else {
					 System.out.println("your are already booked");
				 }
				 }
				 
			 else{
				 System.out.println("invalid name enter the correct name");
			 }
			 
		 }
		 catch(Exception e){
			 System.out.println("invalid data");
		 }
	 }
	 
	 private static void waitingList() {
		 Iterator <String> iterator=waiting_ticket.iterator();
		 if(waiting_ticket.size()>=1) {
			 System.out.println("Names");
			 while(iterator.hasNext()) {
				 String element =iterator.next();
				 System.out.println(element);
			 		}
		 }
	 }
	

}
