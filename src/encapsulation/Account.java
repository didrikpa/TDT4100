package encapsulation;

public class Account {
	
	private double balance;
	private double interestRate;
	
	
	public Account(double balance, double interestRate){
		if (balance < 0 || interestRate < 0){
			throw new IllegalArgumentException("blubli");
		}
		else{
			this.balance = balance;
			this.interestRate = interestRate;
		}
		
	}
	public double getBalance(){
		return balance;
		
	}
	public double getInterestRate(){
		return interestRate;
		
	}
	public void setInterestRate(double interestRate){
		if(interestRate < 0){
			throw new IllegalArgumentException("Interest rate cannot be under 0");
		}
		else{
			this.interestRate = interestRate;
		}
		
	}
	public void deposit(double money){
		if(money > 0){
			balance = balance + money;
		}
		else{
			throw new IllegalArgumentException("msut be blu");
		}
		
	}
	public void withdraw(double money){
		if(money < 0){
			throw new IllegalArgumentException("kuk");
		}
		else if(balance < money){
			throw new IllegalStateException("kuk");
		}
		else{
			balance = balance - money;
		}
	}
}
