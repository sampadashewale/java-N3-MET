package org.tnsif.listdemo;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		Stack<String>obj=new Stack<>();
		obj.push("Shital");
		obj.push("Sampada");
		obj.push("Sakshi");
		obj.push("Vaibhav");
		System.out.println("The Element Inside Stack : "+obj);
		obj.pop();
		System.out.println("The Elements Inside Stack After Pop : "+obj);
	}

}
