package ¿ving9;

public class CreditAccount extends AbstractAccount {
	
	protected double creditLine;
	
	public void setCreditLine(double creditLine){
		if( creditLine < 0){
			throw new IllegalArgumentException();
		}
		if(balance < 0){
			if( getBalance() + creditLine < 0){
				throw new IllegalStateException();
			}
		}
		this.creditLine = creditLine;
	}
	
	public double getCreditLine(){
		return creditLine;
	}
	
	public CreditAccount(double creditLine){
		this.creditLine = creditLine;
		
	}

	public void internalWithdraw(double withdrawAmount) {
		if(withdrawAmount < 0){
			throw new IllegalArgumentException();
		}
		else if(withdrawAmount > super.getBalance() + creditLine){
			throw new IllegalStateException();
		}else{
			balance -= withdrawAmount;
		}
	}
}
