package Twitter;

import java.util.ArrayList;
import java.util.List;

public class SimpleClient extends Client {
	
	ArrayList<Mail> inbox;
	int capacity;
	
	public SimpleClient( int capacity){
		inbox = new ArrayList<Mail>();
		this.capacity = capacity;
	}

	public List<Mail> getInbox() {
		return inbox;
	}
	
	public void youGotMail(Mail mail){
		if(inbox.size() >= capacity){
			inbox.remove(0);
		}
		super.youGotMail(mail);
	}

}
