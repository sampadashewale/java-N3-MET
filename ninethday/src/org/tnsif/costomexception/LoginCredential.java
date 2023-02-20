package org.tnsif.costomexception;

public class LoginCredential extends Exception {
	//data members
		String str;

		//parameterized constructor
		public LoginCredential(String str) {
			super();
			this.str = str;
		}

		//to string method
		@Override
		public String toString() {
			return "LoginCredential [str=" + str + "]";
		}
	
	

}
