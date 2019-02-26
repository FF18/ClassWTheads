package accounts;

public class Spender extends Account {

	private int amount;
	public void run() {
	
	for(int i=1000;i>0;i--) {
		balance -= amount;
	}
	return;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}
}



