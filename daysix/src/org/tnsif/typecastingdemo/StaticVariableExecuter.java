package org.tnsif.typecastingdemo;

public class StaticVariableExecuter {
	public static void main(String[] args) {
		StaticVariable s=new StaticVariable("sampada");
		System.out.println(s.toString());
		System.out.println(StaticVariable.companyname);
	}

}
