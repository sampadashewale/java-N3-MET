package org.tnsif.typecastingdemo;

public class staticBlockExecuter {
	public static void main(String[] args) {
		staticBlock s=new staticBlock();
		s.setNum(3);
		System.out.println(s.getNum());
		System.out.println(staticBlock.name);
	}

}
