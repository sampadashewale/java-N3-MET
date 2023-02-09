package org.tnsif.typecastingdemo;

public class StaticMethodExecuter {
	public static void main(String[] args) {
		StaticMethod s=new StaticMethod();
		System.out.println(s.get());
		
		//static variable access dont creat object of class
		//parentclass.static_varibable;
		StaticMethod.display();
		
		
	}

}
