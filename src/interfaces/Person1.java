package interfaces;

public class Person1 implements Named {
	private String givenName;
	private String familyName;
	private String fullName;
	
	public Person1(String givenName, String familyName){
		this.givenName = givenName;
		this.familyName = familyName;	
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFullName(String fullName) {
		this.fullName = getGivenName() + " " + getFamilyName();
	}

	public String getFullName() {
		return fullName;
	}

}
