package encapsulation;

public class AdditionSubrationCalculator {
	
	private double firstOperand;
	private double secondOperand;
	private char operator;
	
	public double getFirstOperand(){
		return firstOperand;
	}
	
	public void setFirstOperand(double firstOperand){
		if(isValidOperand(firstOperand)){
			this.firstOperand = firstOperand;
			
		}
		else {
			throw new IllegalArgumentException("Operand must be positive.");
		}
	}
	public boolean isValidOperand(double operand) {
		if( operand >= 0.0){
			return true;
		}
		else{
			false;
		}
	}
	
	public double calculateesult() {
		if( operator == '+'){
			return firstOperand + secondOperand;
			
		}
		else if( operator == '-'){
			return firstOperand - secondOperand;
		}
		else return Double.NaN;
	}

}
