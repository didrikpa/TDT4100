package stateandbehaviour;
import java.util.*;

public class RandomStringGenerator {
	public String word= "";
	public String random = "abcdefgh";
	public int wordLength = random.length();
	Random rand = new Random();
	

	public String getRandomString(){
		for(int i = 0; i < wordLength; i++){
			int r = rand.nextInt(wordLength);
			word = word + random.charAt(r);
	
		}
		return word;
	}

}
