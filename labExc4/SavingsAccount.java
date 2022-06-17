package labExc4;

public class SavingsAccount extends AccountAbstract {


	final double minbal = 500;
	double bal = getBalance();
	public SavingsAccount(long accNum,double balance, Person accHolder) {
		super(accNum,balance,accHolder);
	}
	@Override
     public void deposit (double amount) {
		bal += amount;
		System.out.print("Balance Updated: " +bal);
	}
	@Override
	public void withdraw(double amount) {
		if(bal - amount < minbal) {
			System.out.println("Amount Cannot be withdrawn due to minimum balance issue");
		}
		else {
			bal -= amount;
		}
	}

}
