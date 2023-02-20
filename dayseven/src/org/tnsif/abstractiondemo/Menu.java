package org.tnsif.abstractiondemo;

public abstract class Menu {
	// abstract method
		abstract void recipe();
		abstract void foodType();
		//concrete method -- Non abstract method
		void menuType()
		{
			System.out.println("Veg and Nonveg");
		}

}
