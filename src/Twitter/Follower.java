package Twitter;

public class Follower implements TwittererListener{

	public void newTweet(Tweet tweet) {
		System.out.println(String.format("%s just tweeted \"%s\"", tweet.username, tweet.text));
	}

}
