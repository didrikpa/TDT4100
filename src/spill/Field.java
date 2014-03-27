package spill;

public class Field {
	
	private int value;
	private boolean changeable;
	
	public Field(int value, boolean changeable){
		this.value = value;
		this.changeable = changeable;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int value){
		if(changeable){
			this.value = value;
		}
	}
	
	public boolean isChangable(){
		return changeable;
	}
	
	public String toString(){
		if(value == 0){
			return " ";
		}else{
			return value + "";
		}
	}

}
