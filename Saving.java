package Frontend;

public class Saving extends Account {
    private final int numberOfTransaction = 3;
    private double balance = 0;
	private final double interest = 3/100;

	
	
	
	public Saving() {
		getFee()
	}
	
	public void add(double amount) {
		balance += amount;
	}
	
	
}
