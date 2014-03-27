package Twitter;

import java.util.ArrayList;

public class Server {
	
	ArrayList<ServerListener> listeners;
	
	public Server(){
		listeners = new ArrayList<ServerListener>();
	}
	
	public void recieveNewMail(String sender, String recipient, String text){
		fireYouGotMail(new Mail(sender, recipient, text));
	}
	
	public void fireYouGotMail(Mail mail){
		for(ServerListener listener : listeners){
			listener.youGotMail(mail);
		}
	}
	
	public void addListener(ServerListener listener){
		listeners.add(listener);
	}
	
	public void removeListener(ServerListener listener){
		listeners.remove(listeners);
	}
	
	public int listenerSize(){
		return listeners.size();
	}

}
