package Frontend;

public class Chequing extends Account{

	private final double interest = 1/100;
	private double balance = 0;
	private double fee;
	private String username;
	private String password;
	
	
	
	public Chequing(String username, String password) {
        super(username, password);

    }
	}
	
	public void add(double amount) {
		balance += amount;
	}
	
	
	
	
	
}
