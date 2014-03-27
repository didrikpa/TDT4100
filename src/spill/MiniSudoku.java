package spill;

import java.util.*;

public class MiniSudoku {

	ArrayList<ArrayList<Field>> board;

	public MiniSudoku(String boardString) {
		board = new ArrayList<ArrayList<Field>>();
		int index = 0;
		for (int r = 0; r < 4; r++) {
			board.add(new ArrayList<Field>());
			for (int c = 0; c < 4; c++) {
				char ch = boardString.charAt(index);
				if (Character.isDigit(ch)) {
					board.get(r).add(new Field(ch - '0', false));
				} else {
					board.get(r).add(new Field(0, true));
				}
				index++;
			}
		}
	}

	// Internal encapsulation.
	private Field getField(int r, int c) {
		return board.get(r).get(c);
	}

	private void setField(Field field, int r, int c) {
		board.get(r).set(c, field);
	}

	public boolean changeField(Field field, int r, int c) {
		if (!getField(r, c).isChangable()) {
			return false;
		}
		if (field.getValue() == 0) {
			setField(field, r, c);
			return true;
		}
		if(checkRow(field, r) && checkCol(field, c) && checkBox(field, r, c)){
			setField(field, r, c);
			return true;
		}
		return false;

	}

	private boolean checkRow(Field field, int r) {
		int value = field.getValue();
		for (int c = 0; c < 4; c++) {
			if (getField(r, c).getValue() == value) {
				return false;
			}
		}
		return true;
	}

	private boolean checkCol(Field field, int c) {
		int value = field.getValue();
		for (int r = 0; r < 4; r++) {
			if (getField(r, c).getValue() == value) {
				return false;
			}
		}
		return true;
	}

	private boolean checkBox(Field field, int r, int c) {
		int value = field.getValue();
		int r1 = (r / 2) * 2;
		int r2 = r1 + 1;
		int c1 = (c / 2) * 2;
		int c2 = c1 + 1;
		if (getField(r1, c1).getValue() == value
				|| getField(r1, c2).getValue() == value
				|| getField(r2, c1).getValue() == value
				|| getField(r2, c2).getValue() == value) {
			return false;
		}
		return true;
	}
	
	public boolean hasWon(){
		for (int r = 0; r < 4; r++) {
			for (int c = 0; c < 4; c++) {
				if(getField(r,c).getValue() == 0){
					return false;
				}
				
			}
			
		}
		return true;
	}

	public String toString() {
		String str = "";
		for (int r = 0; r < 4; r++) {
			str += board.get(r).toString() + "\n";
		}
		return str;
	}

	public static void main(String[] args) {
		MiniSudoku ms = new MiniSudoku("3  2 41  32 4  1");
		System.out.println(ms);
	}

}
