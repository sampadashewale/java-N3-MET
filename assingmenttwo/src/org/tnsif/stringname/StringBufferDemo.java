package org.tnsif.stringname;


//program to demonstrate on StringBuffer
public class StringBufferDemo {
	public static void main(String[] args) {
		//length vs capacity
		StringBuffer sb=new StringBuffer("Sampada");
		System.out.println(sb);
		System.out.println(sb.capacity()); 
		System.out.println(sb.length());
		
		String str;
		int a=50;
		sb=new StringBuffer(40);
		str=sb.append(a).toString();
		System.out.println(str);
		System.out.println(sb);//50
		System.out.println(sb.reverse());

		
	}
	
}
