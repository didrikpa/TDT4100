package connectfour3;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.io.BufferedReader;

public class StandardLevelFormat implements LevelFormat {

	public ArrayList<ArrayList<Piece>> readLevel(InputStream stream)
			throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		ArrayList<ArrayList<Piece>> Board = new Board
		return null;
	}

	public void writeLevel(OutputStream stream) throws IOException {
		
	}

}
