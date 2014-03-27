package Twitter;

public class Mail {
	
	String sender, recipient, text;
	
	public Mail(String sender, String recipient, String text){
		this.sender = sender;
		this.recipient = recipient;
		this.text = text;
	}
	
	public toString(){
		return String.format("{From=%s, to=%s, text = %s", sender, recipient, text});
	}

}
