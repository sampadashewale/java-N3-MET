package org.tnsif.exceptionhandlingdemo;

public class ArrayOutOfBoundDemo {
	public static void main(String[] args) {
		int a[]={1,2,3};
		try {
			
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);//exception occur
			System.out.println("hello");//after exception code not execute
			}
		catch(ArrayIndexOutOfBoundsException e) {// handle exception and type of exception
			System.out.println("erro occur "+e);
			}
		finally { //it always execute
			System.out.println(" finally block");
		}
		System.out.println("code terminate");
		}


}
