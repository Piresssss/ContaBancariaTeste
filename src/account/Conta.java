package account;

public class Conta {
	
	private int number;
	private String holder;
	private double balance;
	
	public Conta(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public Conta(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public static void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount +5.0;
	}
	public String toString() {
		return "Account "
				+ number
				+", Holder: "
				+ holder
				+", balance: $ "
				+ String.format("%.2f", balance);
		
		
	}
}
