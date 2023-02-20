package org.tnsif.exceptionhandlingdemo;

public class ArithmaticExceptionDemo {
	public static void main(String[] args) {
	int x=20;
	int y=0;
	try {
		int z=x/y;// exception occur
		System.out.println(z);
		}
	catch(Exception e) {// handle exception and type of exception
		System.out.println("erro occur "+e);
		}
	finally {//it always execute
		System.out.println(" finally block");
	}
	
	}

}
