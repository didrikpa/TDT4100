package connectfour3;

import java.io.IOException;
import java.util.Scanner;

public class ConnectFourDriver {
	
	public static void main(String[] args) throws IOException {
		ConnectFour cf = new ConnectFour();
		cf.init();
		cf.run();
		String line;
		Scanner scanner = new Scanner(System.in);
		do {
			line = scanner.next();
		} while (cf.doLine(line) == null);
	}
}