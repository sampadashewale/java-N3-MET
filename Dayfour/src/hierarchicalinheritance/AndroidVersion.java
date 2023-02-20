package hierarchicalinheritance;

public class AndroidVersion {
private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void AndroidVesion() {
		
	}

	public void AndroidVesion(String type) {
		
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "AndroidVersion [type=" + type + "]";
	}

}
