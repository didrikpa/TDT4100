package game1;

import java.util.*;

public class TicTacToe {
	
	TicTacToeProgram tttp = new TicTacToeProgram();
	

	private ArrayList<ArrayList<Piece>> board;
	private char player;
	private int counter = 0;
	private int size;
	private int victoryCondition;
	private ArrayList<Piece> moves;
	private ArrayList<Piece> undo;
	

	public TicTacToe(int size, int victoryCondition) {
		this.size = size;
		this.victoryCondition = victoryCondition;
		board = new ArrayList<ArrayList<Piece>>();
		undo = new ArrayList<Piece>();
		moves = new ArrayList<Piece>();
		for (int r = 0; r < size ; r++) {
			ArrayList<Piece> temp = new ArrayList<Piece>();
			for (int c = 0; c < size; c++) {
				temp.add(new Piece(' ', r, c));
			}
			board.add(temp);
		}
		player = 'o';
		
	}
	public void undo(){
		Piece piece = undo.remove(undo.size()-1);
		moves.add(piece);
		removePiece(piece);
	}
	
	public void moves(){
		Piece piece = moves.remove(undo.size()-1);
		undo.add(piece);
		placePiece(piece.getX(),piece.getY());
	}
	
	public Piece getPiece(int r, int c) {
		return board.get(r).get(c);
	}

	public void setPiece(int r, int c, Piece piece) {
		board.get(r).set(c, piece);
		undo.add(piece);
	}
	
	public void removePiece(Piece piece){
		board.get(piece.getX()).set(piece.getY(), new Piece(' ', piece.getX(), piece.getY()));
	}

	public boolean placePiece(int r, int c) {
		if (getPiece(r, c).getValue() != ' ') {
			return false;
		} else {
			for (int dr = size; dr >= 0; r--) {
				if (getPiece(r, c).getValue() == ' ') {
					setPiece(r, c, new Piece(player, dr, dr));
					counter ++;
					return true;
				}
			}
			throw new IllegalArgumentException();
		}

	}

	public void changePlayer() {
		if (player == 'o') {
			player = 'x';
		} else {
			player = 'o';
		}
	}

	public char getPlayer() {
		return player;
	}

	public boolean hasWon() {
		for (int r = 0; r < size; r++) {
			for (int c = 0; c < size; c++) {
				if (getPiece(r, c).getValue() != ' '
						&& hasWonFromPosition(r, c)) {
					return true;
				}
			}
		}
		return false;
	}
	private boolean hasWonFromPosition(int r, int c){
		for (int dr = -1; dr < 1; dr++) {
			for (int dc = -1; dc < 1; dc++) {
				if(dr != 0 || dc != 0){
					if( hasWonFromPositionInDirection(r, c, dr, dc)){
						return true;
					}
				}
				
			}
		}
		return false;
	}
	
	private boolean hasWonFromPositionInDirection(int r, int c, int dr, int dc){
		char value = getPiece(r, c).getValue();
		int counter = 0;
		while(0 <=r && r < size && 0 <= c && c < size && getPiece(r, c).getValue() == value){
			r += dr;
			c += dc;
			counter ++;
		}
		return counter>=victoryCondition;
	}
	
	public boolean noWinner(){
		if(counter >= size*size){
			if(! hasWon()){
				return true;
				
			}
		}
		return false;
	}
	
	public String toString() {
		String str = "";
		for (int r = 0; r < size; r++) {
			str += "|";
			for (int c = 0; c < size; c++) {
				str += board.get(r).get(c).toString() + "_ ";
				str += "|";
			}
			str += "\n";
		}
		return str;
	}

}
