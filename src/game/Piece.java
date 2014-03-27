package game;

public class Piece {
	
	private char value;
	
	public Piece(char value){
		this.value = value;
	}
	
	public void setValue(char value){
		this.value = value;
	}
	
	public char getValue(){
		return value;
	}
	
	public String toString(){
		return "" + value;
	}

}
