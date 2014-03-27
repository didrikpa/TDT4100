package interfaces;

public class Card implements Comparable<Card>{
	
	private char suit;
	private int face;
	
	
	public Card(char suit, int face){
		if("SHDC".indexOf(suit) == -1){
			throw new IllegalArgumentException();
		}
		else if(face < 1 || face > 13){
			throw new IllegalArgumentException();
		}
		else{
		this.suit = suit;
		this.face = face;
		}
	}
	
	public char getSuit(){
		if(suit != 'S'&& suit != 'H'&&suit != 'D'&&suit != 'C'){
			throw new IllegalArgumentException();
		}else return this.suit;
	}
	
	public int getFace(){
		if(face < 0 || face > 13){
			throw new IllegalArgumentException();
		}else return this.face;
		
	}
	public String toString(){
		return suit+"" + face;
		
	}

	public int compareTo(Card card) {
		int diff = "SHDC".indexOf(card.suit) - "SHDC".indexOf(card.suit);
		if (diff == 0) {
			diff = face - card.face;
		}
		return diff;
	}
}
