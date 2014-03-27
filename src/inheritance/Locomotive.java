package inheritance;

import java.util.ArrayList;

public class Locomotive {
	
	ArrayList<TrainCar> trainCars;

	public Locomotive() {
		trainCars = new ArrayList<TrainCar>();
	}
	
	public void addTrainCar(TrainCar trainCar){
		trainCars.add(trainCar);
		
	}
	
	public boolean contains(TrainCar trainCar){
		return trainCars.contains(trainCar);
	}
	
	public int getTotalWeight(){
		int totalWeight = 0;
		for(TrainCar trainCar : trainCars){
			totalWeight += trainCar.getTotalWeight();
		}
		return totalWeight;
	}
	
	public int getPassengerCount(){
		int passengerCount = 0;
		for(TrainCar trainCar : trainCars){
			if(trainCar instanceof PassengerCar ){
				passengerCount += ((PassengerCar) trainCar).getPassengerCount();
			}
		}
		return passengerCount;
	}
	
	public int getCargoWeight(){
		int cargoWeight = 0;
		for(TrainCar trainCar : trainCars){
			if (trainCar instanceof CargoCar){
				cargoWeight += ((CargoCar) trainCar).getCargoWeight();
			}
		}
		return cargoWeight;
		
	}
	
	public String toString(){
		String output = "";
		for (TrainCar car : trainCars) {
			output += car.toString() + "\n";
		}
		return output;
	}

}
