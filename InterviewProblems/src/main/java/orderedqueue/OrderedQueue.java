package main.java.orderedqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Must return the items in correct order when next is called, if ids are missing it returns null
 * e.g.
 * put id 1
 * put id 2
 * next >> returns 1 and 2
 * put 4
 * put 5
 * next >> returns null
 * put 3
 * next returns 3, 4, and 5
 */
public class OrderedQueue {

    private Map<Integer, String> map = new ConcurrentHashMap<>();
    private AtomicInteger nextId = new AtomicInteger(1);
    private Lock lock = new ReentrantLock();

    public void put(int seqId, String msg){
            map.put(seqId, msg);
    }

    public List<String> next(){
        List<String> result = new ArrayList<>();
        try{
            lock.lock();
            while(map.containsKey(nextId)){
                result.add(nextId + ":" + map.remove(nextId));
                nextId.incrementAndGet();
            }
        }finally{
            lock.unlock();
        }
        return result;
    }
}
