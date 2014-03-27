package stateandbehaviour;

public class Location {
	public int x;
	public int y;
	
	void up() {
		y=y-1;
	}
	void down() {
		y=y+1;
	}
	void left() {
		x=x-1;
	}
	void right() {
		x=x+1;
	}

}
