package thread;


import java.util.LinkedList;
import java.util.Queue;


public class InterThreadCommunicationExample {

    public static void main(String args[]) {

        final Queue sharedQ = new LinkedList();

        Thread producer = new Producer(sharedQ);
        Thread consumer = new Consumer(sharedQ);

        producer.start();
        consumer.start();

    }
}

 class Producer extends Thread {
    private final Queue sharedQ;

    public Producer(Queue sharedQ) {
        super("Producer");
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {

        for (int i = 0; i < 140 ; i++) {

            synchronized (sharedQ) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ.size() >= 1) {
                    try {
                    	System.out.println("Queue is full, waiting");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println("Loop : " + i);
                sharedQ.add(7);
                sharedQ.add(8);
                sharedQ.notify();
            }
        }
    }
}

class Consumer extends Thread {
   // private static final Logger logger = Logger.getLogger(Consumer.class);
    private final Queue sharedQ;

    public Consumer(Queue sharedQ) {
        super("Consumer");
        this.sharedQ = sharedQ;
    }

    @Override
    public void run() {
        while(true) {

            synchronized (sharedQ) {
                //waiting condition - wait until Queue is not empty
                while (sharedQ.size() == 0) {
                    try {
                    	
                    	System.out.println("Queue is empty, waiting");
                        sharedQ.wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                int number = (int) sharedQ.poll();
                System.out.println("consuming : " + number );
                sharedQ.notify();
              
                //termination condition
                if(number == 3){break; }
            }
        }
    }
}
