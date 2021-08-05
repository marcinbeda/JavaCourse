package concurrency.multithreadedCollections.delayedQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/**
 * Created by Marcin Beda.
 */

public class DelayedQueueMain {

    public static void main(String[] args) {

        BlockingQueue<DelayedMission> missionQueue = new DelayQueue<>();

        try {
            missionQueue.put(new DelayedMission("Character woke up", 5000));
            missionQueue.put(new DelayedMission("Character came back from the hunt", 9000));
            missionQueue.put(new DelayedMission("Character sold items", 7000));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (!missionQueue.isEmpty()) {
            try {
                DelayedMission take = missionQueue.take();
                System.out.println(take.getMission());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Team is ready for the quest");
    }
}
