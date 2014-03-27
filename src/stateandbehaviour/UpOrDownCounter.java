package stateandbehaviour;

public class UpOrDownCounter {
	public int counter;
	public int end;
	public UpOrDownCounter(int start, int end){
		this.counter = start;
		this.end = end;
		if (start == end) throw new IllegalArgumentException();
	}
	public int getCounter(){
		return counter;
	
	}
	public boolean Count(){
		if(counter == end){
			return false;
		}
		else if(counter > end){
			counter--;
			if(counter == end){
				return false;
			}
			else{
				return true;
			}
		}
		else if (counter  < end){
			counter++;
			if(counter == end){
				return false;
			}
			else{
				return true;
			}
		}
	return true;
	}
	
}