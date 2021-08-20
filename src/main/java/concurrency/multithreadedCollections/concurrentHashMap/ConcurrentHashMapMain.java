package concurrency.multithreadedCollections.concurrentHashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ConcurrentHashMapMain {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);

        ConcurrentMap<Integer, String> map = new ConcurrentHashMap<>();

        service.execute(new AddingItemsRunnable(map));
        service.execute(new GettingItemsRunnable(map));

        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(20);
        list.add(25);

        List<Integer> synchronizedList = Collections.synchronizedList(list);
    }
}
