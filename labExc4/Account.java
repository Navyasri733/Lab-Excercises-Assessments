package labExc4;

public class Account {

	    private long accNum;
		private double balance;
		private Person accHolder;

		public Account(long accNum,double balance,Person accHolder ) {
			super();
			this.accNum = accNum;
			this.balance = balance;
			this.accHolder = accHolder;
		}
		public long getAccNum() {
			return accNum;

		}
         public void setAccNum(long accNum) {
        	 this.accNum = accNum;
         }
         public Person getAccHolder() {
        	 return accHolder;
         }
         public void setAccHolder(Person accHolder) {
        	 this.accHolder = accHolder;
         }
         public void setBalance(double balance) {
        	 this.balance = balance;

         }
         public void deposit(double amount) {
        	 balance += amount;
         }
         public void withdraw(double amount) {
        	 balance -= amount;
         }
         public void getBalance() {
        	 System.out.println(balance);
         }
         @Override
         public String toString() {
        	 return "Account[accNum=" +accNum+", balance =" +balance+ ", accHolder =" +accHolder+ "]";
         }

	}


