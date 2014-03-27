package ¿ving9;

public class DebitAccount extends AbstractAccount {
	
	protected double withdrawAmount;
	

	public void internalWithdraw(double withdrawAmount) {
		if (withdrawAmount > balance ){
			throw new IllegalStateException();
		}
		else if(withdrawAmount < 0){
			throw new IllegalArgumentException();
		}
		balance -= withdrawAmount;
	}

}
