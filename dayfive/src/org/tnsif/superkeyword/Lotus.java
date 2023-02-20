package org.tnsif.superkeyword;

public class Lotus extends Flower{
	private String name;

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//default constructor
	public Lotus() {
		super();
	}
	
    // parameterized constructor  
	public Lotus(String name) {
		super();
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(name);
		super.setName("Flower");
		System.out.println(super.getName());
	}
	

}
