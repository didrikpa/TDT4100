package Twitter;

public class Authorities implements TwittererListener {
	
	public void newTweet(Tweet tweet){
		if(tweet.text.contains("terrorist")){
			System.out.println(String.format("The tweet \"%s\" should be investigated.", tweet.text, tweet.username));
		}
	}

}
