package concurrency.multithreadedCollections.exchanger;

import java.util.concurrent.Exchanger;

/**
 * Created by Marcin Beda.
 */

public class WarriorRunnable implements Runnable {

    private Exchanger<Item> exchanger;
    private Item armor;

    public WarriorRunnable(Exchanger<Item> exchanger, Item armor) {
        this.exchanger = exchanger;
        this.armor = armor;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Warrior has: " + armor);
                Item exchangedItem = exchanger.exchange(armor);
                System.out.println("Warrior received given item: " + exchangedItem);
                armor = exchangedItem;
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
