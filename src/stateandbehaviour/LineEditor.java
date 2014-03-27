package stateandbehaviour;

public class LineEditor 
{
	public String text;
	public int insertionIndex;
	
	
	
	
	void left()
	{
		if (insertionIndex > 0){
		insertionIndex--;
		}
	}
	void right()
	{
		if (insertionIndex < text.length()){
		insertionIndex = insertionIndex + 1;
		}
	}
	void insertString(String s)
	{
		text = new StringBuffer(text).insert(insertionIndex, s).toString();
		  insertionIndex += s.length();
		
	}
	void deleteLeft()
	{
		if(insertionIndex>0){
			String newstr = text.substring(0, insertionIndex-1) + text.substring(insertionIndex);
			text = newstr;
			insertionIndex--;
		}
	}
	void deleteRight()
	{
		if(insertionIndex< text.length()){
			String newstr = text.substring(0, insertionIndex) + text.substring(insertionIndex+1);
			text = newstr;
		}
	}
	
	

}
