package game1;

import java.io.FileInputStream;
import java.util.Scanner;

public class TicTacToeProgram {
	
	StandardLevelFormat slf = new StandardLevelFormat();

	TicTacToe tictactoe;
	Scanner scanner;
	private int size;
	private int victoryCondition;
	private String load;
	
	public void init() throws Exception {
		this.scanner = new Scanner(System.in);
		this.load = scanner.next();
		if(load.equals("l")){
			slf.readLevel(new FileInputStream("/Users/didrik/Documents/workspace/TDT4100/Files/tictactoe.txt"));
			tictactoe = new TicTacToe(size, victoryCondition);
		}
		else{
		this.size = scanner.nextInt();
		this.victoryCondition = scanner.nextInt();
		tictactoe = new TicTacToe(size, victoryCondition);

		}
	}

	public void run() {
		
		while (!tictactoe.hasWon()) {
			System.out.println(tictactoe);
			System.out.println("Player " + tictactoe.getPlayer()
					+ " enter column and rad:");
			
			int r = scanner.nextInt();
			if(r == -1){
				tictactoe.undo();
			}
			else if(r == -2){
				tictactoe.moves();
			}
			int c = scanner.nextInt();
			if (tictactoe.placePiece(r, c)) {
				tictactoe.changePlayer();
			}
			if (tictactoe.hasWon()) {
				System.out.println(tictactoe);
				tictactoe.changePlayer();
				System.out.println("Player " + tictactoe.getPlayer()
						+ " has won");
			}
			if(tictactoe.noWinner()){
				System.out.println(tictactoe);
				System.out.println("The game ended in a draw!");
				break;
			}

		}
	}
	

	

	public static void main(String[] args) throws Exception {
		TicTacToeProgram tttp = new TicTacToeProgram();
		tttp.init();
		tttp.run();
	}
}

