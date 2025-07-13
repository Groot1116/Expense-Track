package Frontend;

public class Saving extends Account {
    private final int numberOfTransaction = 3;
    private double balance = 0;
	private final double interest = 3/100;
	private String username;
	private String password;

	
	
	
	public Saving(String username, String password) {
		super(username, password);
	}
	
	public void add(double amount) {
		balance += amount;
	}
	
	
}
