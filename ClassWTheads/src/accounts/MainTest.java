package accounts;

public class MainTest extends Thread {
	protected int balance;
	public void run() {
		
		System.out.println("Balance on account : "+ balance);
	}
	public static void main(String[] args) {
		Account balance = new Account();
		
		balance.start();
		
	}

}
