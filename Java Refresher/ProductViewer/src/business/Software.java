package business;

import business.Product;

public class Software extends Product {
	
	private String version;
	
	public Software() {
		super();
		version = "";
	}
	
	@Override
	public String toString() {
		return super.toString() + " " +  version;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	// setVersion, getVersion

}
