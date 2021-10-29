
public class RunnableDemo implements Runnable {
	int x=0;
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName()+": "+ i);
		synchronized (this) {
			x=x+10;
			System.out.println(Thread.currentThread().getName()+": "+ x);
		}
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		RunnableDemo r = new RunnableDemo(); // Runnable reference of runnable
		Thread t1 = new Thread(r); // new state
		t1.setName("t1");
		t1.start(); // Runnable state
		
		Thread t2 = new Thread(r);// new state
		t2.setName("t2");
		t2.start();// Runnable state
		

	}

}
