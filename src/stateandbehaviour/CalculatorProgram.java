package stateandbehaviour;
import java.util.*;


/**
 * @author didrik
 *
 */
public class CalculatorProgram {
	
	public static void main(String[]args){
		Calculator kalkulator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		kalkulator.setFirstOperand(scanner.nextDouble());
		while(true){
			kalkulator.setOperator(scanner.next().charAt(0));
			kalkulator.setSecondOperand(scanner.nextDouble());
			kalkulator.calculateAndSetFirstOperand();
		
			System.out.println(kalkulator.firstOperand);
		}
	}

}
