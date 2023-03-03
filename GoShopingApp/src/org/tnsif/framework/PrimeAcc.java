package org.tnsif.framework;

public abstract class PrimeAcc extends ShopAcc {

	private boolean isPrime;
	private static final float deliverycharges=0.0f;
	
	
	 public PrimeAcc(int accno, String accnm, float charges, boolean isPrime) {
			super(accno, accnm, charges);
			
		}
	 
	 public void bookProduct(float charges) {
		 System.out.println("acc no. "+this.getAccno()+" acc name "+this.getAccnm()+" deliverey charges "+(this.getCharges()+this.deliverycharges));
	 }

	@Override
	public String toString() {
		return "primeAcc [isPrime=" + isPrime + "]";
	}
	 
	 
}
