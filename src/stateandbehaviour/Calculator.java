package stateandbehaviour;

public class Calculator {
	public double firstOperand;
	public double secondOperand;
	public char operator;
	
	void setFirstOperand(double firstOperand){
		this.firstOperand = firstOperand;
	}
	void setSecondOperand(double secondOperand){
		this.secondOperand = secondOperand;
	}
	void setOperator(char operator){
		this.operator = operator;
	}
	double calculateResult(){
		if(operator == 43){
			return(firstOperand + secondOperand);
		}
		else if(operator == 42){
			return(firstOperand * secondOperand);
		}
		else if(operator == 45){
			return(firstOperand - secondOperand);
		}
		else if(operator == 47){
			if (secondOperand != 0){
				return(firstOperand / secondOperand);
			}
			
		}
		else if(operator == 37){
			return(firstOperand % secondOperand);
		}
		throw new IllegalArgumentException();
		
	}
	void calculateAndSetFirstOperand(){
		firstOperand = calculateResult();
		
		
	}
	
	

}
