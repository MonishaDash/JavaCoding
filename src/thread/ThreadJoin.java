package thread;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadJoin {

	public static void main(String[] args){
		 final Queue sharedQ = new LinkedList();
        Thread producer = new Thread1(sharedQ,10);
        Thread consumer = new Thread2(sharedQ,10);

        producer.start();
        consumer.start();
	}

}
class Thread1 extends Thread {
    private final Queue sharedQ;
    private int loopLength;

    public Thread1(Queue sharedQ,int loopLength) {
        this.sharedQ = sharedQ;
        this.loopLength = loopLength;
    }

    @Override
    public void run() {

        for (int i = 0; i < loopLength ; i++) {

            synchronized (sharedQ) {
                while (sharedQ.size() >= 1) {
                    try {
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println("Thread1 : " + i);
                sharedQ.add(i);
                sharedQ.notify();
            }
        }
    }
}

class Thread2 extends Thread {
    private final Queue sharedQ;
    private int loopLength;

    public Thread2(Queue sharedQ,int loopLength) {
        this.sharedQ = sharedQ;
        this.loopLength = loopLength;
    }

    @Override
    public void run() {
    	for (int i = 0; i < loopLength ; i++)  {

            synchronized (sharedQ) {
                while (sharedQ.size() == 0) {
                    try {
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                int number = (int) sharedQ.poll();
                System.out.println("Thread2 : " + i );
                sharedQ.notify();

            }
        }
    }
}