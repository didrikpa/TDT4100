package game1;

public class Piece {
	private char value;
	private int x;
	private int y;
	
	public Piece(char value, int x, int y){
		this.value = value;
		this.x = x;
		this.y = y;
	}
	
	public void setValue(char value){
		this.value = value;
	}
	
	public char getValue(){
		return value;
	}
	

	public void setX(int x){
		this.x = x;
	}
	
	public int getX(){
		return x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getY(){
		return y;
	}
	
	public String toString(){
		return "" + value + x + y;
	}
	

}
