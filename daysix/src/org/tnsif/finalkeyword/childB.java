package org.tnsif.finalkeyword;


//we cant overide final method of parent class same as method in child class *(display())* 
//so we use paramerter 

public class childB extends cake {
	int a,b;
	
 void display(int a,int b) {//non final method
		this.a=a;
		this.b=b;
		System.out.println(a+"  "+b);
	}

}
