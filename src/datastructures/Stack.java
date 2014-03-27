package datastructures;

import java.util.ArrayList;

public class Stack extends Container {
	
	public Stack(){
		list = new ArrayList<Object>();
	}

	public Object pop() {
		return list.remove(list.size()-1);
	}

}
