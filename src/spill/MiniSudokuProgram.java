package spill;
import java.util.*;

public class MiniSudokuProgram {
	
	MiniSudoku miniSudoku;
	
	public void init(){
		miniSudoku = new MiniSudoku("3  2 41  32 4  1");
	}
	
	public void run(){
		Scanner scanner = new Scanner(System.in);
		while(! miniSudoku.hasWon()){
			System.out.println(miniSudoku);
			System.out.println("Please enter row col and value of next placement: ");
			int r = scanner.nextInt();
			int c = scanner.nextInt();
			int value = scanner.nextInt();
			miniSudoku.changeField(new Field(value, true), r, c);
		}
		System.out.println(miniSudoku);
		System.out.println("Congrats - you won the game!");
	}
	
	public static void main(String[] args){
		MiniSudokuProgram msp = new MiniSudokuProgram();
		msp.init();
		msp.run();
	}

}
