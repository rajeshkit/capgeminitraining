package abstractiondemo;


public abstract class Phone {
	public Phone() {
		
	}
	int aadharNumber=56556565;
	public void makeCalls() {
		System.out.println("CDMA/LOTE/GPS");
	}
	private void whatsApp() {
		System.out.println("Working");
	}
	public abstract void sms();
	public abstract void camera();
	
	public static void main(String[] args) {
		Phone p4;
		Phone p5;
		//reference and object
	}
}
