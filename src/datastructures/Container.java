package datastructures;

import java.util.List;

public abstract class Container {
	
	protected List<Object> list;
	
	public int size(){
		return list.size();
	}
	
	public boolean contains(Object o){
		return list.contains(o);
	}
	
	public void push(Object o){
		list.add( list.size(), o);
	}
	
	public abstract Object pop();
	
	public Object peek(int index){
		return list.get(index);
	}
	
	public String toString(){
		return list.toString();
	}
	
	public static void main(String[] args) {
		Container queue = new Queue();
		Container stack = new Stack();
		queue.push("1");
		queue.push("2");
		queue.push("3");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		System.out.println(queue);
		System.out.println(stack);
		queue.pop();
		stack.pop();
		System.out.println(queue);
		System.out.println(stack);
	}

}
