package multilevelinheritance;

public class Android {
	private String version;
	public void accept()
	{
		System.out.println("The Android Version Name Is : "+version);
	}
	
	//getters and setters
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	public Android() {
		super();
		
	}

	//parameterized constructor
	public Android(String version) {
		super();
		this.version = version;
	}

}
