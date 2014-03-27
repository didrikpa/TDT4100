package inheritance;

public class ForeldreSpar extends SavingsAccount {

	private int legalWithdraw;
	private int remainingLegalWithdraw;

	public ForeldreSpar(double interestRate, int legalWithdraw) {
		super(interestRate);
		this.legalWithdraw = legalWithdraw;
		this.remainingLegalWithdraw = legalWithdraw;
	}

	public void setLegalWithdraw(int legalWithdraw) {
		this.remainingLegalWithdraw = legalWithdraw;
	}

	public int getLegalWithdraw() {
		return remainingLegalWithdraw;
	}

	public void withdraw(double withdraw) {
		if (getLegalWithdraw() > 0) {
			super.withdraw(withdraw);
			remainingLegalWithdraw -= 1;
		} else {
			throw new IllegalStateException();
		}
	}

	public int getRemainingWithdrawals() {
		return remainingLegalWithdraw;

	}

	protected void endYearUpdate() {
		super.endYearUpdate();
		setLegalWithdraw(legalWithdraw);

	}

}
