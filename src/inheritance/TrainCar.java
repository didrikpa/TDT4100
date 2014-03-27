package inheritance;

public class TrainCar {
	
	private int weight;
	private int deadWeight;
	
	public TrainCar(int deadWeight){
		this.deadWeight = deadWeight;	
		
	}
	public int getTotalWeight(){
		return weight + deadWeight;
	}
	
	public void setDeadWeight(int deadWeight){
		this.deadWeight = deadWeight;
	}
	
	public int getDeadWeight(){
		return deadWeight;
	}
	
	
	
	

}
