package ¿ving9;

public abstract class AbstractAccount {
	
	protected double balance;
	
	public AbstractAccount(){
		this.balance = 0;
	}
	
	public void deposit(double depositAmount){
		if (depositAmount < 0){
			throw new IllegalArgumentException();
		}
		else{
			balance += depositAmount;
		}
		
	}
	
	public void withdraw(double withdrawAmount){
		internalWithdraw(withdrawAmount);
	}
	
	public abstract void internalWithdraw(double withdrawAmount);
	
	public double getBalance(){
		return balance;
		
	}

}
