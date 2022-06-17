package labExc4;

import java.util.concurrent.atomic.AtomicInteger;

public class AccountMain {

	public static void main(String[] args) {

		Person smith = new Person("Smith",24);
		Person kitty = new Person("Kitty",21);
		AtomicInteger count = new AtomicInteger(0);
		Account smithaccount = new Account(count.incrementAndGet(), 2000, smith);
		Account kittyaccount = new Account(count.incrementAndGet(), 3000, kitty);

		System.out.println(smithaccount);
		System.out.println(kittyaccount);

		smithaccount.deposit(2000);
		kittyaccount.withdraw(3000);

		System.out.println("Balance in smith's Account: ");
		smithaccount.getBalance();
	    System.out.println("Balance in kitty's Account: ");
	    kittyaccount.getBalance();


	}

}
