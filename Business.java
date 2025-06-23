package Frontend;

public class Business extends Account {
	private double balance = 0;
	private final double interest = 1/100;
	
	
	
	public Business() {
		getFee();
	}
	
	public void add(double amount) {
		balance += amount;
	}
	
	
}

