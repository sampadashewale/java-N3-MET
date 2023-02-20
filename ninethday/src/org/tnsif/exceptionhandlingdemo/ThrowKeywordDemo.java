package org.tnsif.exceptionhandlingdemo;

public class ThrowKeywordDemo {
	
	public static void donate(int age,int weight) throws Exception{
		if (age>21 || weight<50) {
			
		}
		else {
			throw new Exception("Not elligible");
		}
	}
	
	public static void main(String[] args) {
		try {
		donate(20, 49);
		}
		catch(Exception e) {
			System.out.println("main exception "+e);
		}
		
	}

}
