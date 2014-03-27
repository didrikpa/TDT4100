package stateandbehaviour;

public class Account 
{
	public double balance = 500.00; 
	public double interestRate = 1.07; 
	public double penger = 107.01;
	
	void deposit(double penger)
	{
		if (penger > 0){

		balance = balance + penger;
		}
	}
	
	void addInterest()
	{
		if (interestRate > 0){
		double interest = balance * interestRate/100;
		balance = balance + interest;
		}
		
		
	}
	
	

}
