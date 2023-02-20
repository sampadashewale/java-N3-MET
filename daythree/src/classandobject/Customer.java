package classandobject;

public class Customer {
	//data members
		private int id;
		private String custname;
		private String city;
		
		//default constructor
		public Customer() {
			
		}
		//parameterized constructor
		public Customer(int id1, String custname, String city) {
			this.id = id1;
			this.custname = custname;
			this.city = city;
			
		}
		/*void display()
		{
			System.out.println(id+" "+custname+" "+city);
		}*/
		
		//getters and setters method
		public int getId() {
			return id;
		}
		public void setId(int id1) {
			this.id = id1;
		}
		public String getCustname() {
			return custname;
		}
		public void setCustname(String custname) {
			this.custname = custname;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}

}
