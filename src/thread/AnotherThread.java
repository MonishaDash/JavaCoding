package thread;

public class AnotherThread extends Thread {
	@Override
	 public void run(){
		 System.out.println("Thread stated : " + currentThread().getName());
		 try {
			 System.out.println("I am sleeping: " +currentThread().getName());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Another thread woke me up");
			//e.printStackTrace();
		}
		 System.out.println(currentThread().getName() +" Woke up after 3 second");
	 }

}
