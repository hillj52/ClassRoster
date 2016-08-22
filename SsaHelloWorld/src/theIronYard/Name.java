package theIronYard;

public class Name {
	
	private String fName;
	private String lName;
	private String mInit;
	
	public Name(String fName, String lName, String mInit) {
		this.fName = fName;
		this.lName = lName;
		this.mInit = mInit;
		if (mInit.length() != 1)
			this.mInit = mInit.substring(0,1);
	}
	
	public Name(String fullName) {
		String[] s = fullName.split("\\s+");
		this.fName = s[0];
		this.lName = s[2];
		this.mInit = s[1];
		if (mInit.length() != 1)
			this.mInit = mInit.substring(0,1);
	}
	
	public String getFName() {
		return fName;
	}
	
	public String getLName() {
		return lName;
	}
	
	public String getMInit() {
		return mInit;
	}
	
	public String toString() {
		return this.lName + ", " + this.fName + " " + this.mInit + ".";
	}
}
