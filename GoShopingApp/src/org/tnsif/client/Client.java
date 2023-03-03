package org.tnsif.client;

import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSPrimeAcc;


public class Client {
	public static void main(String[] args) {
		GSShopFactory f=new GSShopFactory();
		GSPrimeAcc p=new GSPrimeAcc(1234,"sampada Shewale",1050f,true);
		GSNormalAcc n=new GSNormalAcc(5678,"pratik more",3060f,60f);
		
		System.out.println(" Prime Account");
		System.out.println(p);
		p.bookProduct(p.getCharges());
		
		System.out.println(" Normal Account");
		System.out.println(n);
		n.bookProduct(n.getCharges());
		
	}
}
