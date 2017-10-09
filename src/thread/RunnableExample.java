package thread;

public class RunnableExample implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started");
		for(int i=0;i<10;i++){
			
			try {
				
				System.out.println(Thread.currentThread().getName() + " "+i);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println(Thread.currentThread().getName()+" ended");
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableExample());
		t1.setName("Thread1");
		Thread t2 = new Thread(new RunnableExample());
		t2.setName("Thread2");
		Thread t3 = new Thread(new RunnableExample(),"Thread3");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			//t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Program ended");
	}

}
