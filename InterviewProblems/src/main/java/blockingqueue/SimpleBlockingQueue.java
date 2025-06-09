package main.java.blockingqueue;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleBlockingQueue<T> {

    private int capacity = 10;
    private final Queue<T> queue = new LinkedList<>();

    public SimpleBlockingQueue(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void enqueue(T element) throws InterruptedException {
        if (queue.size() == capacity) {
            System.out.println("At capacity......waiting");
            wait();
        }
        notifyAll();
        queue.add(element);
    }

    public synchronized T dequeue() throws InterruptedException {
        if (queue.isEmpty()) {
            System.out.println("Empty.....waiting");
            wait();
        }
        notifyAll();
        return queue.remove();
    }
}
