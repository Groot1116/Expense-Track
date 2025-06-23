package Frontend;

public class Chequing extends Account{

	private final double interest = 1/100;
	private double balance = 0;
	private double fee;
	
	
	
	public Chequing() {
		fee = getFee();	
	}
	
	public void add(double amount) {
		balance += amount;
	}
	
	
	
	
	
}
