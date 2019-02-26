package accounts;

public class Saver extends Account {

	private int amount;
	
	public void run() {
		
		for(int i=0;i<1000;i++) {
			balance += amount;
		}
		return;
		}

	public void deposit(int amount) {
		balance += amount;
	}
}





