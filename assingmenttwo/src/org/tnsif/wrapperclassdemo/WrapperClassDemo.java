package org.tnsif.wrapperclassdemo;

public class WrapperClassDemo {
	public static void main(String[] args) {
		//Auto boxing
		int x=18;
		Integer y=x;
		System.out.println(y);
		
		//UnBoxing
		Integer i=new Integer(10+5);
		//Integer i=new Integer(10);
		System.out.println(i);
		int b=i.intValue();
		System.out.println(b);

	}

}
