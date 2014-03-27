package ¿ving9;

public class SavingsAccount extends AbstractAccount {
	
	protected int withdrawals;
	protected double fee;
	
	public SavingsAccount(int withdrawals, double fee){
		this.withdrawals = withdrawals;
		this.fee = fee;
	}

	public void internalWithdraw(double withdrawAmount) {
		if(withdrawAmount < 0){
			throw new IllegalArgumentException();
		}
		else if(withdrawAmount > super.getBalance()){
			throw new IllegalStateException();
		}
		else if(withdrawals > 0){
			balance -= withdrawAmount;
			withdrawals -= 1;
		}
		else{
			if((withdrawAmount + fee) > balance){
				throw new IllegalStateException();
			}
			balance -= (withdrawAmount + fee);
		}

	}

}
