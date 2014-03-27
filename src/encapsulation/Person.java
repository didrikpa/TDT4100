package encapsulation;

import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Person {

	private String name;
	private String firstName;
	private String lastName;
	private String email;
	private Date birthday;
	private char gender;

	public void setName(String name) {
		if (isValidName(name)) {
			this.name = name;
		} else {
			throw new IllegalArgumentException(name + "is an invalid name.");
		}
	}

	public boolean isValidName(String name) {
		if (name.contains(" ")) {
			String[] nameSplit = name.split(" ");
			firstName = nameSplit[0];
			lastName = nameSplit[1];
			if (firstName.matches("[a-zA-Z]+") && lastName.matches("[a-zA-Z]+")) {
				if (firstName.length() >= 2 && lastName.length() >= 2) {
					return true;
				}
			}
		}
		return false;
	}

	public void setEmail(String email) {
		if (isValidEmail(email)) {
			this.email = email;
		} else {
			throw new IllegalArgumentException(email + "is an invalid name");
		}
	}

	public boolean isValidEmail(String email) {
		String[] emailSplit = email.split("\\W");
		String[] isoCodes = Locale.getISOCountries();
		String[] name = this.name.split(" ");

		if (emailSplit.length != 4) {
			throw new IllegalArgumentException("Invalid email");
		} else if (!(emailSplit[0].toLowerCase()
				.contains(name[0].toLowerCase()) && emailSplit[1].toLowerCase()
				.contains(name[1].toLowerCase()))) {
			throw new IllegalStateException("Invalid email");
		}

		else if (!(Arrays.asList(isoCodes)
				.contains(emailSplit[3].toUpperCase()))) {
			throw new IllegalArgumentException("Invalid email");
		}

		return true;
	}
	public void setBirthday(Date birthday) {
		if (isValidBirthday(birthday)) {
			this.birthday = birthday;
		} else {
			throw new IllegalArgumentException("Date of birth must be before this date. ");
		}

	}

	public boolean isValidBirthday(Date birthday) {
		if (!birthday.before(new Date())) {
			return false;
		}
		return true;

	}

	public void setGender(char gender) {
		if (isValidGender(gender)) {
			this.gender = gender;
		} else {
			throw new IllegalArgumentException("Invalid gender.");
		}
	}

	public boolean isValidGender(char gender) {
		String stringGender = String.valueOf(gender);
		if (stringGender.length() != 1) {
			return false;
		} else if (stringGender.matches("M") || stringGender.matches("F")
				|| stringGender.matches("\0")) {
			return true;
		}

		return false;

	}

	public String getName() {
		return name;

	}

	public String getEmail() {
		return email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public char getGender() {
		return gender;
	}

	public static void main(String[] args) {

	}

}
