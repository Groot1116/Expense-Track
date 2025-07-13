package Frontend;

public class Business extends Account {
	private double balance = 0;
	private final double interest = 1/100;
	private String username;
	private String password;
	
	
	public Business(String username, String password) {
		super(username, password);
	}
	
	public void add(double amount) {
		balance += amount;
	}
	
	
}

