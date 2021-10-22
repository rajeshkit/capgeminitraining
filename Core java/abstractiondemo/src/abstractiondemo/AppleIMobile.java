package abstractiondemo;

public class AppleIMobile extends Phone{

	@Override
	public void sms() {
		// TODO Auto-generated method stub
		System.out.println("messaging technologies");
	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub
		System.out.println("cinematic mode");
	}
	
	public static void main(String[] args) {
		AppleIMobile mobile=new AppleIMobile();
		mobile.makeCalls();
	
		mobile.camera();
		mobile.sms();
	}
}
