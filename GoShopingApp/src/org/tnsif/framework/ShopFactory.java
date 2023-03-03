package org.tnsif.framework;

public abstract class ShopFactory {
	public abstract void getNewPrimeAcc(int accno,String accnm,float charges,boolean isPrime);
	public abstract void NormalAcc(int accno,String accnm,float charges,boolean isPrime);
	
}
