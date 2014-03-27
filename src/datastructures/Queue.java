package datastructures;

import java.util.ArrayList;

public class Queue extends Container {
	
	public Queue(){
		list = new ArrayList<Object>();
	}

	public Object pop() {
		return list.remove(0);
	}

}
