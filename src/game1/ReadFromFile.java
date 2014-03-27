package game1;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFromFile {
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("/Users/didrik/Documents/workspace/TDT4100/Files/tictactoe.txt"));
		while (reader.ready()) {
			System.out.println(reader.readLine());
		}
		
		FileReader reader2 = new FileReader("/Users/didrik/Documents/workspace/TDT4100/Files/tictactoe.txt");
		while (reader2.ready()) {
			System.out.println(Character.toChars(reader2.read()));
		}
	}
}
