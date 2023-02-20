package org.tnsif.polymorphismdemo;

public class SBI extends RBI{
	//overriding the parent class method here
			float getInterest()
			{
				System.out.println(super.getInterest());
				return 12.8f;
			}

}
