
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) 
	{
		System.out.println("___conversion types___");
		System.out.println(" choose one type of conversion ==> 1.length /n2.temperature/n3.area");
		System.out.println("enter the type");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		switch(a)
		{
		case 1:
		{
			System.out.println("Length Conversion");
			System.out.println("choose one type of conversion ==> 1.inch to m /n2.m to inch ");
			System.out.println("enter the type of conversion :");
			int a1=input.nextInt();
			if (a1==1)
			{
				System.out.println("enter the inch value: ");
				int inch=input.nextInt();
				double inch_output = inch/39.37;
				 int inchhalf = (int) inch_output;
                 double centi = (inch_output - inchhalf) * 100;
				System.out.println(inch +" inch = " +inchhalf + " M " + (int)centi + " CM");
			}
			else if (a1==2)
			{
				System.out.println("enter the meter value");
				int meter=input.nextInt();
				double meter_output= meter*39.37;
				int meterhalf=(int) meter_output;
				double centi1=(meter_output-meterhalf)*100;
				System.out.println( meter+ "M  = "+meterhalf+"Inch" + (int)centi1 +"M" );
			}
			else {
				System.out.println("invalid data");
			}
		}
		break;
		case 2:{
			System.out.println("temperature");
			System.out.println("choose one type of conversion ==> 1. cel to far /n2.far to cel");
			System.out.println("enter the type of conversion :");
			int b1=input.nextInt();
			if (b1==1)
			{
				System.out.println("enetr the celcious value :");
				int cel =input.nextInt();
				double cel_output =(cel*9/5) + 32;
				System.out.println( cel+"Celcious = "+ cel_output +"Fahrenheit" );
			}
			else if(b1==2) 
			{
				System.out.println("enetr the Fahrenheit value :");
				int far =input.nextInt();
				double far_output =(far-32)*(5/9) ;
				System.out.println( far+" Fahrenheit = "+ far_output +"Celcious" );
			}
		}
		break;
		case 3:{
			System.out.println("Area");
			System.out.println("choose one type of conversion ==> 1. square foot to square meter /n2.square meter to square footer");
			System.out.println("enetr the type of conversion :");
			int c1=input .nextInt();
			if (c1==1)
			{
				System.out.println("enter the square foot value :");
				int sq_foot=input.nextInt();
				double foot_output= sq_foot/10.764;
				int halffeet=(int)foot_output;
				double centi2 =(foot_output-halffeet)*100;
				System.out.println( sq_foot + "sq.feet = "+ halffeet+"sq.meter" + (int)centi2 +"CM");
			}
			else if (c1==2)
			{
				System.out.println("enter the square meter value :");
				int sq_meter=input.nextInt();
				double meter_output= sq_meter*10.764;
				int halfmeter=(int) meter_output;
				double centi3 =(meter_output - halfmeter)*100;
				System.out.println( sq_meter + "sq.meter = "+ halfmeter+"sq.feet " +(int)centi3 + "M");
			}
		}
		break;
		}
		input.close();
	}

}
