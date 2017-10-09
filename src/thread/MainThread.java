package thread;

public class MainThread {

	public static void main(String[] args) {
		System.out.println("Hello from Main thread");
		Thread obj = new AnotherThread();
		obj.setName("Thread1");
		obj.start();
		
//		new Thread(){
//			public void run(){
//				System.out.println("Hello from anonymous class");
//			}
//		}.start();
//		
//		Thread runnable = new Thread(new RunnableExample());
//		runnable.start();
		
		System.out.println("Hello Again from Main thread");
		obj.interrupt();
		
		Thread t = new AnotherThread();
		t.setName("Thread2");
		t.start();
	}

}
