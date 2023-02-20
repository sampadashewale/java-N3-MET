package org.tnsif.exceptionhandlingdemo;

public class ManyException {
	public static void main(String[] args) {
		int a[]={1,2,3};
		try {
			int z=12/0;
			System.out.println(z);
			System.out.println(a[3]);//exception occur
			System.out.println("hello");//after exception code not execute
			}
		
		//multiple catch
		//we can also use (| pipe operator) for multiple catch
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("catch1 occur "+e);
			}
		/*catch(ArithmeticException m) {
			System.out.println("catch2 occur "+m);
			}*/
		
		finally { //it always execute
			System.out.println(" finally block");
		}
		System.out.println("code terminate");
		}


}
