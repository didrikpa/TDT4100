package stateandbehaviour;

public class AccountProgram {
	public static void main(String[] args)
	{
		
		Account konto = new Account();
		konto.deposit(500.00);
		konto.addInterest();
		System.out.println(konto.balance);
		
		
	}
}
