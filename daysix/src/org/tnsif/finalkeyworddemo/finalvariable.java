package org.tnsif.finalkeyworddemo;


//final keyword- provide restriction to user
//1. constant value not, changeable value if change then error occur
//2. must initialize value to variable otherwise error occur

public class finalvariable {
	final static int x=10;
	public static void print() {

		System.out.println(x);
	}
		
public static void main(String[] args) {
	finalvariable.print();
}

}
