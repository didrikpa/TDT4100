package connectfour3;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFromFile {
	
	
	public static void main(String[] args) throws Exception {
		// Reads from file one line at a time
		// NB: you need to update the file path before running
		BufferedReader reader = new BufferedReader(new FileReader("/Users/paulus/Dropbox/Vitass/workspace/tdt4100/files/connectfour.txt"));
		while (reader.ready()) {
			System.out.println(reader.readLine());
		}
		
		// Reads from file one character at a time
		// NB: you need to update the file path before running
		FileReader reader2 = new FileReader("/Users/paulus/Dropbox/Vitass/workspace/tdt4100/files/connectfour.txt");
		while (reader2.ready()) {
			System.out.println(Character.toChars(reader2.read()));
		}
	}
}
