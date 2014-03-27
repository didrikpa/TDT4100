package interfaces;

public class Person2 implements Named {

	private String fullName;

	public Person2(String fullName) {
		this.fullName = fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setGivenName(String givenName) {
		this.fullName = givenName + " " + getFamilyName();
	}

	public String getGivenName() {
		return fullName.substring(0, this.fullName.indexOf(" "));
	}

	public void setFamilyName(String familyName) {
		this.fullName = getGivenName() + " " + familyName;
	}

	public String getFamilyName() {
		return fullName.substring(this.fullName.indexOf(" ")+1);
	}
}
