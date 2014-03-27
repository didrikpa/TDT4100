package stateandbehaviour;
import java.util.*;

public class Stack {
	public ArrayList<String> stringList = new ArrayList<String>();
	public int lengde = stringList.size();
	
	
	
	public void push(String str){
		stringList.add(0, str);
		
	}
	public String pop(){
		if(lengde < 0){return null;}
		else{return (String) stringList.remove(0);
		}
		
		
	}
	public String peek(int index){
		if(index < 0 || index > stringList.size() - 1){
			return null;
			
		}
		return (String) stringList.get(index);
	}
			
	public int getSize(){
		return stringList.size();
	}

}
