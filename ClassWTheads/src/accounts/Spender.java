package accounts;

public class Spender extends Account {
	protected int withdraw;//murida money from hashbon
//	private Account account;
	
	public void run() {
	
	for(int i=1000;i>0;i--) {
		
	}
	return;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
//	public Account getAccount() {
//		return account;
//	}
//	public void setAccount(Account account) {
//		this.account = account;
//	}
	public void withdraw(int amount) {
		balance -= amount;
	}
}



