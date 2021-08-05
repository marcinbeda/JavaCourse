package concurrency.multithreadedCollections.exchanger;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Marcin Beda.
 */

public class ExchangerMain {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);

        Exchanger<Item> itemExchanger = new Exchanger<>();

        service.execute(new WarriorRunnable(itemExchanger, new Item("Basic armor", 0)));
        service.execute(new BlacksmithRunnable(itemExchanger, new Item("Reinforced armor", 2)));
    }
}
