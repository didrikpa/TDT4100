package spill;

import java.util.Scanner;

public class ConnectFourProgram {
	
	ConnectFour connectFour;
	
	public void init(){
		connectFour = new ConnectFour();
		
		
	}
	
	public void run(){
		Scanner scanner = new Scanner(System.in);
		while(! connectFour.hasWon()) {
			System.out.println(connectFour);
			System.out.println("Player " + connectFour.getPlayer() + "enter column over next drop:");
			int c = scanner.nextInt();
			if(connectFour.drop(c)){
				connectFour.changePlayer();
			}
			
		}
	}
	public static void main(String[] args){
		ConnectFourProgram cfp = new ConnectFourProgram();
		cfp.init();
		cfp.run();
	}

}
