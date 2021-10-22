


public class BankDetails {
	private int accountNumber;
	private int balance;
	private String branchName;
	public String ifscCode;
	// getters and setters method
	// getter method is going to read the value from the private variable
	// setter method writes the value into the private variable
	public int getAccountNumber() {
		
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	
	
}
