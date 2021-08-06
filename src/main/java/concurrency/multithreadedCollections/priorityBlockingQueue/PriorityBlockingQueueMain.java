package concurrency.multithreadedCollections.priorityBlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by Marcin Beda.
 */

public class PriorityBlockingQueueMain {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);

        BlockingQueue<Case> caseQueue = new PriorityBlockingQueue<>();

        Case case1 = new Case("flu", 2);
        Case case2 = new Case("common cold", 1);
        Case case3 = new Case("broken finger", 3);

        service.execute(new CaseRunnable(caseQueue, case1, case2, case3));

        Case case4 = new Case("flu", 2);
        Case case5 = new Case("pneumonia", 5);
        Case case6 = new Case("broken leg", 4);

        service.execute(new CaseRunnable(caseQueue, case4, case5, case6));
        service.execute(new HospitalRunnable(caseQueue));
    }
}
