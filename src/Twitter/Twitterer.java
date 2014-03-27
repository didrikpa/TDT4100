package Twitter;

import java.util.ArrayList;

public class Twitterer {
	
	String username;
	ArrayList<TwittererListener> listeners;
	
	public Twitterer(String username){
		this.username = username;
		listeners = new ArrayList<TwittererListener>();
	}
	
	public void twitter(String text, boolean retweet){
		fireNewTweet(new Tweet(username, text, retweet));
	}
	
	public void fireNewTweet(Tweet tweet){
		for (TwittererListener listener : listeners){
			listener.newTweet(tweet);
		}
	}
	
	public void addListener(TwittererListener listener){
		listeners.add(listener);
	}
	
	public void removeListener(TwittererListener listener){
		listeners.remove(listener);
	}
	
	public int listenerSize(){
		return listeners.size();
	}
	
	public static void main(String[] args) {
		Twitterer twitterer = new Twitterer("username");
		Follower follower = new Follower();
		Authorities authorities = new Authorities();
		twitterer.addListener(follower);
		twitterer.addListener(authorities);
		twitterer.twitter("My first tweet", false);
		twitterer.twitter("I want to be a terrorist when I grow up.", false);
	}
}
