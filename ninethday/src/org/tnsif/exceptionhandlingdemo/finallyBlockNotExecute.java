package org.tnsif.exceptionhandlingdemo;

public class finallyBlockNotExecute {
	public static void main(String[] args) {
		
		
		int a[]={1,2,3};
		try {
			//System.out.println(a[0]);
			//System.out.println(a[1]);
			//System.out.println(a[2]);
			//System.exit(0); //get out of code
			System.out.println(a[3]);//exception occur
			System.exit(0);
			System.out.println("hello");//after exception code not execute
			}
		
		catch(ArrayIndexOutOfBoundsException e) {// handle exception and type of exception
			System.out.println("exception occur "+e);		
			//System.exit(0);
			}
		
		/*finally { //it always execute until we give "System.exit(0);" in catch  block
			System.out.println("\nfinally block");
		}*/
		finally {
			int z=12/0;//error occur
			System.out.println("z");
			
			
		}
		
		
		}
	
	//finally block not execute when...
	//1. System.exit(0);
	//2. finally block contain exception code
	

}
