package connectfour3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public interface LevelFormat {
	
	public ArrayList<ArrayList<Piece>> readLevel(InputStream stream) throws IOException;
	
	public void writeLevel(OutputStream stream) throws IOException;
	

}
