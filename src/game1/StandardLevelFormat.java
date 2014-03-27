package game1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class StandardLevelFormat implements LevelFormat {

	public ArrayList<ArrayList<Piece>> readLevel(InputStream stream)
			throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		ArrayList<ArrayList<Piece>> board = new ArrayList<ArrayList<Piece>>();
		while (reader.ready()) {
			String line = reader.readLine();
			board.add(new ArrayList<Piece>());
			for (int i = 0; i < line.length(); i++) {
				char ch = line.charAt(i);
				board.get(board.size()-1).add(new Piece(ch, i, i));
			}
		}
		reader.close();
		return board;
	}

	public void writeLevel(ArrayList<ArrayList<Piece>> board,
			OutputStream stream) throws IOException {
		OutputStreamWriter writer = new OutputStreamWriter(stream);
		for (ArrayList<Piece> row : board) {
			for (Piece piece : row) {
				char ch = piece.getValue();
				writer.write(ch);
			}
			writer.write("\n");
		}
		writer.close();
	}
}