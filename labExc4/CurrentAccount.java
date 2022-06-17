package labExc4;

public class CurrentAccount  extends AccountAbstract{

	boolean flag = true;
	double bal = getBalance();
	double overdraftlimit = -1;
	public CurrentAccount(long accNum, double balance,Person accHolder){
		super(accNum, balance, accHolder);

	}

	public void deposit(double amount) {
		 bal += amount;
	 }

	public void withdraw(double amount) {
		if(bal - amount <= overdraftlimit) {
			System.out.println("Overdraft limit reached: amount cannot be withdraw");
		}
		else {
			bal -= amount;

		}

	}
	public void getaccountBalance() {
		System.out.println(bal);
	}

}
