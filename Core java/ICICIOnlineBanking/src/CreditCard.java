
public class CreditCard {
	public String checkCibilScore() {
		CibilScore score = new CibilScore();
		if (score.getCibilScore() > 650) {
			return "Ok";
		}
		return "Not Ok";
	}

	public void approveCreditCard() {
		SavingAcount sa=new SavingAcount();
		System.out.println(sa.name);
		System.out.println(sa.accountNumber);
		System.out.println(sa.branchName);
		System.out.println(sa.balance);
		sa.createSavingAccount();
		sa.getStatement();
	}

	public static void main(String[] args) {
		CreditCard cc = new CreditCard();
		cc.approveCreditCard();
	}
}
//SavingAcount account = new SavingAcount();
//account.getStatement();
//if (account.balance > 5000) {
//	if (checkCibilScore().equals("Ok")) {
//		return true;
//	}
//}
//return false;