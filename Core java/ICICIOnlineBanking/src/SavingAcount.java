public class SavingAcount {
	String name;
	int accountNumber;
	int balance;
	String branchName;
	void createSavingAccount() {
		name="Rajesh";
		accountNumber=46465;
		balance=5754;
		branchName="Chennai";
	}
	void getStatement() {
		System.out.println(name);
		System.out.println(accountNumber);
		System.out.println(balance);
		System.out.println(branchName);
	}
	
}
