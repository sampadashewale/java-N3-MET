package org.tnsif.finalkeyworddemo;

public class finalclassexecuter {
	public static void main(String[] args) {
		finalchildclass fchild=new finalchildclass();
		fchild.income();

		//to call finalclass create seperate boj to access it
		finalclassparent fparent=new finalclassparent();
		fparent.income();
	}

}
