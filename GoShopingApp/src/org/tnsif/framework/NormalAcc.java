package org.tnsif.framework;

public abstract class NormalAcc extends ShopAcc {
	
	final private float deliverycharges;

	public NormalAcc(int accno, String accnm, float charges, float deliverycharges) {
		super(accno, accnm, charges);
		this.deliverycharges = deliverycharges;
	}

	@Override
	public String toString() {
		return "NormalAcc [deliverycharges=" + deliverycharges + "]";
	}
	
	 public void bookProduct(float charges) {
		 System.out.println("acc no. "+this.getAccno()+" acc name "+this.getAccnm()+" deliverey charges "+(this.getCharges()+this.deliverycharges));
	 }
	

}

