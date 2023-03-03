package org.tnsif.application;

import org.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accno, String accnm, float charges, float deliverycharges) {
		super(accno, accnm, charges, deliverycharges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSNormalACC [toString()=%s]"+super.toString()+"]";
	}

	@Override
	public void bookProduct() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
