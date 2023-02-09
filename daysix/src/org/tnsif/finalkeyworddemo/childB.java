package org.tnsif.finalkeyworddemo;

//we can't override final method of parent class same as method in child class *(display())* 
//so we use parameter

public class childB extends cake{
	int a,b;

	 void display(int a,int b) {//non final method
			this.a=a;
			this.b=b;
			System.out.println(a+"  "+b);
		}

}
