package org.tnsif.typecastingdemo;

public class staticBlock {
	private int num;
	public static String name;//static variable
	
	//static block to initialize static variable
	static {
		//num=10;
		name="sampada";//in static block must use static variable
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	

}
