package Project01;

public class SavingAccount {
	private int accountNumber;
	private double balance;
	
	public static double interestRate = 0;
	public static int numberofAccounts = 0;
	
	public SavingAccount(int number) {
		accountNumber = number;
		balance = 0;
		numberofAccounts++;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public static int getNumberofAccounts() {
		return numberofAccounts;
	}
	public static void showBalance(SavingAccount account) {
		System.out.println(account.getAccountNumber() + "의 잔고 : "  );
	}
	private String getAccountNumber() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void setInterestRate(double d) {
		// TODO Auto-generated method stub
		
	}
	public void deposit(int i) {
		// TODO Auto-generated method stub
		
	}
	public void withdraw(int i) {
		// TODO Auto-generated method stub
		
	}

}
