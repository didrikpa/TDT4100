package Twitter;

import java.util.List;

public abstract class Client implements ServerListener {

	public void youGotMail(Mail mail) {
		getInbox().add(mail);
	}
	
	public abstract List<Mail> getInbox();
	
	

}
