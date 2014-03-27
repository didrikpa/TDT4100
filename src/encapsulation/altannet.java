package encapsulation;

import java.util.Arrays;

public class altannet {
	for(int i = 0; i < firstName.length(); i++) {
		char c = firstName.charAt(i);
		if(! (Character.isLetter(c))){
			return false;
		}
	}
	for(int x = 0; x < lastName.length(); x++){
		char ch = lastName.charAt(x);
		if(! (Character.isLetter(x))){
			return false;
		}
		
	}
	return false;
}
else if(! isLetters(emailSplit[2])){
	return false;
}
else if(! Arrays.asList(landkodeEn).contains(emailSplit[3])){
	return false;
}
return true;
}
