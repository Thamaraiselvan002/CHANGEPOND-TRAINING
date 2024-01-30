package stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		String a1="java programming";
		String b1="object oriented language";
		String c1="こんにちは";//Japanese language
		String c2="வணக்கம்";
		String d1="hello";
		System.out.println(a1 +" "  + b1);
		System.out.println((String.join(" * ", a1,b1)));
		System.out.println(a1.concat( " " +b1));
		System.out.println(a1.contains("java"));
		System.out.println(a1.contains("program"));
		System.out.println(a1.equals(b1));
		System.out.println(b1.substring(3,5));
		String [] specs =b1.split( "  ");
		for(String str:specs){
			System.out.println(str);
		}
		
		System.out.println(b1.replace("o", " C"));
		System.out.println(b1.length());
		System.out.println(b1.getBytes());
		System.out.println(a1.toUpperCase());
		System.out.println(b1.toLowerCase());
		System.out.println(d1.toUpperCase());
		System.out.println(c2.toUpperCase());
		System.out.println(c1.toUpperCase());
	}

}
