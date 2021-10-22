package encapsulationdemo;

public class OnlineBanking {
	public static void main(String[] args) {
		BankDetails bd=new BankDetails();
		bd.setAccountNumber(22334455);
		bd.setBalance(10000);
		bd.setBranchName("Chennai");
		System.out.println(bd.getAccountNumber());
		System.out.println(bd.getBalance()); 
		System.out.println(bd.getBranchName());
	}
}
