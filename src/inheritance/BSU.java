package inheritance;

public class BSU extends SavingsAccount {

	private double maximumDeposit;
	private double bsu;

	public BSU(double interestRate, double maximumDeposite) {
		super(interestRate);
		this.maximumDeposit = maximumDeposite;

	}

	public void deposit(double deposit) {
		if ((getbsuBalance() + deposit) <= maximumDeposit) {
			super.deposit(deposit);
			bsu += deposit;
		} else {
			throw new IllegalStateException();
		}
	}

	public void withdraw(double withdraw) {
		if (withdraw > getbsuBalance()) {
			throw new IllegalStateException();
		} else {
			super.withdraw(withdraw);
			bsu = bsu - withdraw;
		}

	}

	protected void endYearUpdate() {
		super.endYearUpdate();
		bsu = 0;
	}

	public double getbsuBalance() {
		return bsu;
	}

	protected double getTaxDeduction() {
		double taxReduction = bsu * 0.20;
		return taxReduction;
	}
}
