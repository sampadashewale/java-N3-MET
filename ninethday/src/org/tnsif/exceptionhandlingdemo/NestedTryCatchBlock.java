package org.tnsif.exceptionhandlingdemo;

public class NestedTryCatchBlock {
	public static void main(String[] args) {
		int a[]={1,2,3};
		try {
			int z=12/0;
			//exception occur
			
			}
		catch(ArithmeticException m) {
			System.out.println("catch2 occur "+m);
        try {
				
				System.out.println(a[3]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			}
		
		finally { //it always execute
			System.out.println(" finally block");
		}
		System.out.println("code terminate");
		}

}
