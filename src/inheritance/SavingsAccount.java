package inheritance;

public class SavingsAccount implements Account {
	
	private double balance;
	private double interestRate;
	
	public SavingsAccount(double interestRate){
		this.balance = 0;
		this.interestRate = interestRate;
		
	}

	public void deposit(double amount) {
		if(amount > 0){
			balance += amount;
		}
		else if(amount < 0){
			throw new IllegalArgumentException();
		}
	}

	public void withdraw(double amount) {
		if(amount < 0){
			throw new IllegalArgumentException();
		}
		else if(amount > balance){
			throw new IllegalStateException();
		}
		else{
			balance -= amount;
		}
	}

	public double getBalance() {
		return this.balance;
	}
	
	protected void endYearUpdate(){
		if (balance < 0){
			throw new IllegalArgumentException();
		}
		else if(balance > 0){
			balance += balance*interestRate;
		}
		
	}

}
