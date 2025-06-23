package Frontend;

import java.util.Scanner;

public class Main { // use "Flinks" and "Plaid" to pull bank information


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans;
		Account a1;
		

		
		
		System.out.println("Signin or Create");
		ans = sc.nextLine();
		if ("create".equalsIgnoreCase(ans)) {
			System.out.println("What is your full name (use spaces): ");
			String name = sc.nextLine();
			
			System.out.println("What is your email: ");
			String email = sc.nextLine();
			
			System.out.println("What is your year of birth: ");
			int yearOfBirth = sc.nextInt();
			
			System.out.println("What is your month of birth: ");
			int monthOfBirth = sc.nextInt();
			
			System.out.println("What is your day of birth: ");
			int dayOfBirth = sc.nextInt();
			
			System.out.println("What is your street address: ");
			String address = sc.nextLine();
			
			System.out.println("Which city do you live in: ");
			String city = sc.nextLine();
			
			System.out.println("Which province do you live in: ");
			String province = sc.nextLine();
			
			System.out.println("What is your zipcode: ");
			String zipcode = sc.nextLine();
			
			
			System.out.println("Create a password: ");
			String password = sc.nextLine();
			
			a1 = new Account(name, email, yearOfBirth, monthOfBirth, dayOfBirth, address, city, province, zipcode, password);
		}
		else if ("signin".equalsIgnoreCase(ans)) {
			menu();
			int option = sc.nextInt();
			String type;
			
			switch(option) {
				case 1:
					type = typeOfAccounts(sc);
					if ("chequing".equalsIgnoreCase(type)) {
						Chequing c1 = new Chequing(); 
					}
					else if ("saving".equalsIgnoreCase(type)) {
						Saving s1 = new Saving();
					}
					
					else if ("business".equalsIgnoreCase(type)) {
						Business b1 = new Business();
					}
					
					else {
						System.out.println("Silly, that isn't an type of account");
					}f

					break;
					
					
				case 2:
					type = typeOfAccounts(sc);
					if ("chequing".equalsIgnoreCase(type)) {
						Chequing c1 = new Chequing(c1.add());
					}
					else if ("saving".equalsIgnoreCase(type)) {
						Saving s1 = new Saving(s1.add());
					}
					
					else if ("business".equalsIgnoreCase(type)) {
						Business b1 = new Business(b1.add());
					}
					
					else {
						System.out.println("Silly, that isn't an type of account");
					}
					
					break;
					
					
				case 3: 
					
					break;
					
					
				case 4:
					break;
					
					
				case 5:
					break;
					
				case 6:
					break;
					
				default:
					
			}
			
			
			
		}
		
		
		public static void menu() {
			System.out.printf(
					"%n %n %n %n %n %n %n",
					"=== Expense Tracker ===",
					"1. Add Account", // from then, choose chequing, saving or business
					"2. Add Expense",
					"3. View Expense", // select monthly or yearly
					"4. Export to CVS",
					"5. Exit",
					"======================="
					
			);
		};
		
		public static String typeOfAccounts(Scanner sc) {
			System.out.printf("Chequing/Saving/Business");
			return sc.nextLine();
		}
		
	}


