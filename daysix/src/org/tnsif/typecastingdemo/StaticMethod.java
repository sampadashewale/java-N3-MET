package org.tnsif.typecastingdemo;

public class StaticMethod {
	 int x=10;
	 static int y=12;


	public int get() {
		return x;
	}

	 static void display() {
		System.out.println("hello static method "+y);//to access variable in static method make variable also static
	}



}
