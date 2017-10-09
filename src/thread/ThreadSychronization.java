package thread;

public class ThreadSychronization {
	private static final Object lock = new Object();
	private static volatile boolean t1turn;
	public static void main(String[] args){
		ThreadSychronization obj = new ThreadSychronization();
		obj.increment();
	}
	
public void increment(){
	t1turn = true;
	Thread t1 = new Thread(new Runnable() {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 1; i <= 10; i ++) {
                    System.out.println("T1=" + i);

                    t1turn = false;
                        try {
                            lock.notifyAll();
                            lock.wait();
                        } catch (InterruptedException e) {
                        }
                }
            }

        }
    });
    Thread t2 = new Thread(new Runnable() {

        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 1; i <= 10; i ++) {
                    if (t1turn)
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                        }
                    System.out.println("T2=" + i);
                    t1turn = true;
                    lock.notify();
                }
            }
        }
    });
    t1.start();
    t2.start();

}
}
