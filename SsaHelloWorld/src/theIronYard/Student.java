/**
 * 
 */
package theIronYard;

/**
 * @author admin
 *
 */
public class Student {
	
	private static int ID = 123456;
	
	private Name name;
	private boolean pass;
	private String major;
	private int daysMissed;
	private int id;
	
	public Student(String fName, String lName, String mInit, String major){
		this.name = new Name(fName,lName,mInit);
		this.major = major;
		this.daysMissed = 0;
		this.pass = true;
		this.id = ID++;
	}
	
	//fullName in the form fName mInit lName
	public Student(String fullName, String major) {
		this.name = new Name(fullName);
		this.major = major;
		this.daysMissed = 0;
		this.pass = true;
		this.id = ID++;
	}
	
	public String getProperName() {
		return name.toString();
	}
	
	public String getFName() {
		return name.getFName();
	}

	public String getLName() {
		return name.getLName();
	}
	
	public String getMInit() {
		return name.getMInit();
	}
	
	public boolean getPass() {
		return this.pass;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int getDaysMissed() {
		return this.daysMissed;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setPass(boolean pass) {
		this.pass = pass;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return "Name: " + this.getProperName() + "\nMajor: " + this.major + "\n"
				+ "Pass/Fail: " + passOrFail() + "\nDays Missed: " + this.daysMissed
				+ "\nID: " + this.id;
	}
	
	//Adds one to the total number of days missed
	public void missedDay() {
		daysMissed++;
	}
	
	//Adds a positive number days, to the total number of days missed
	public void missedDay(int days) {
		if (days >= 0) 
				daysMissed+=days;
	}
	
	public void resetDaysMissed() {
		this.daysMissed = 0;
	}
	
	public void fail() {
		this.pass = false;
	}
	
	public void pass() {
		this.pass = true;
	}
	
	private String passOrFail() {
		return (pass)?"Pass":"F"
				+ "ail";
	}
	
}
