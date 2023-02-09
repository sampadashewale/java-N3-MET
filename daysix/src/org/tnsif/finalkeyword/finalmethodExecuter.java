package org.tnsif.finalkeyword;

public class finalmethodExecuter {
	public static void main(String[] args) {
		childB b=new childB();
		b.setFlavour("chocolate");
		System.out.println(b.getFlavour());
		b.display(5, 6);    //normal method of childB class call
		b.display();        //final method call of cake class
		
	}

}
