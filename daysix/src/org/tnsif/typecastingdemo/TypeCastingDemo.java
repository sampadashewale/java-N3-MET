package org.tnsif.typecastingdemo;

public class TypeCastingDemo {
	public static void main(String[] args) {

		//implicit
		int x=15;
		long y=5;
		float z=x;

		//explicit
		short s=(short)x;
		double d=12.5;
		long l=(long)d;  //(long)must use for explicite otherwise give error
		
		System.out.println(x);
		System.out.println(z);
		System.out.println(d);
		System.out.println(l);
		System.out.println(s);
		System.out.println(y);
		//System.out.println();



	}


}
