package stateandbehaviour;

public class LineEditorProgram {
	public static void main(String[] args)
	{
		LineEditor nyStreng = new LineEditor();
		nyStreng.deleteLeft();
		System.out.println(nyStreng.text);
	}
	
}
