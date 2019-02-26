package accounts;

public class Saver extends Account {
//	protected int deposit;//tosefet money to hashbon
//	private Account account;
	private int amount;
	
	public void run() {
		
		for(int i=0;i<1000;i++) {
			balance += amount;
		}
		return;
		}

//		public int getDeposit() {
//			return deposit;
//		}
//		public void setDeposit(int deposit) {
//			this.deposit = deposit;
//		}
	
//	public Account getAccount() {
//		return account;
//	}
//	public void setAccount(Account account) {
//		this.account = account;
//	}
	public void deposit(int amount) {
		balance += amount;
	}
}





