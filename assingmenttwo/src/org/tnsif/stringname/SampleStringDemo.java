package org.tnsif.stringname;

public class SampleStringDemo {
	public static void main(String[] args) {
		//creating a string using literals
				String s1="Sampada";
				String s2="Sampada";
				
				    //creating a string using new operator
				String s3=new String("Bhujbal");
				String s4=new String("Bhujbal");
				
				    //string comparison
				System.out.println(s1==s2);
				System.out.println(s2==s3);
				System.out.println(s1.equals(s4));
				
				     //using compareTo
				System.out.println(s1.compareTo("Met"));
				System.out.println(s1.compareToIgnoreCase("Met"));
				System.out.println(s1.compareTo(s2));
	}

}
