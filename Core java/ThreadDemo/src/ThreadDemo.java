
public class ThreadDemo extends Thread{
	
	@Override
	public void run() {
		System.out.println("welcome to capgemini thread session"); // task for thread t1
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo(); // t1 --> java thread object
		t1.start();// my thread t1 has started its execution
		// start method internally calls the run method(task)
		ThreadDemo t2=new ThreadDemo();
		t2.start();
		t1.setName("mythread1");
		t1.setPriority(10);//1-10  1- min 5-normal 10 max
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.getState());
		System.out.println("*****************");
		t2.setName("mythread2");
		t2.setPriority(10);
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		System.out.println(t2.getState());
	
	}

}
