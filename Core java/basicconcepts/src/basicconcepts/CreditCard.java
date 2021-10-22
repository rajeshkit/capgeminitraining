package basicconcepts;

public class CreditCard {
	String name;
	int mobileNo;
	long cardNumber;
	float balance;
	static String branchName;
	static String cityName;
	
	
	public CreditCard() {
		super();
	}
	
	public CreditCard(String name, int mobileNo, long cardNumber, float balance) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.cardNumber = cardNumber;
		this.balance = balance;
	}
	public void getBalance() {
		System.out.println("This is your balance");
		System.out.println(mobileNo);
	}
	public void showStatement() {
		System.out.println("statement is ready");
		getBalance();
	}
	public static void sum()
	{
		System.out.println("sum");
	}
	
	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", mobileNo=" + mobileNo + ", cardNumber=" + cardNumber + ", balance="
				+ balance + "]";
	}
	public static void main(String[] args) {
		CreditCard cc1=new CreditCard("Rajesh",56756,3426768,6588);
		CreditCard cc2=new CreditCard("kumar",343345,69865856,3434);
		CreditCard cc3=new CreditCard("vishali",34564,57876845,3233);
		CreditCard cc4=new CreditCard("Sachin",45345,456745747,3554);
		System.out.println(cc1);
		System.out.println(cc2);
		System.out.println(cc3);
		System.out.println(cc4);
		
		System.out.println(cc1 instanceof CreditCard );
		System.out.println(cc1 instanceof Object);

		
		
	}

}
