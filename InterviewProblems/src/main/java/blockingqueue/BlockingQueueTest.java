package main.java.blockingqueue;

public class BlockingQueueTest {

    public static class Producer implements Runnable {
        private final SimpleBlockingQueue<String> queue;

        Producer(SimpleBlockingQueue<String> q) {
            queue = q;
        }

        public void run() {
            try {
                while (true) {
                    queue.enqueue(produce());
                }
            } catch (InterruptedException ex) {
            }
        }

        String produce() {
            System.out.println("Producing....");
            return "string";
        }
    }

    static class Consumer implements Runnable {
        private final SimpleBlockingQueue<String> queue;

        Consumer(SimpleBlockingQueue<String> q) {
            queue = q;
        }

        public void run() {
            try {
                while (true) {
                    consume(queue.dequeue());
                }
            } catch (InterruptedException ex) {
            }
        }

        void consume(Object x) {
            System.out.println("got something");
        }
    }

    public static void main(String[] args) {
        SimpleBlockingQueue<String> q = new SimpleBlockingQueue<>(10);
        Producer p = new Producer(q);
        Consumer c1 = new Consumer(q);
        Consumer c2 = new Consumer(q);
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }

}
