package inheritance;

public class PassengerCar extends TrainCar {
	
	private int passengerCount;

	public PassengerCar(int deadWeight, int passengerCount ) {
		super(deadWeight);
		this.passengerCount = passengerCount;
	}
	
	public void setPassengerCount(int passengerCount){
		this.passengerCount = passengerCount;
	}
	
	public int getPassengerCount(){
		return passengerCount;
	}
	
	public int getTotalWeight(){
		return super.getTotalWeight() + passengerCount*80;
	}

}
