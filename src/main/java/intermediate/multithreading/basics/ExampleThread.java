package intermediate.multithreading.basics;

import java.util.stream.IntStream;

/**
 * Created by Marcin Beda.
 */

public class ExampleThread extends Thread {

    public ExampleThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        IntStream.rangeClosed(1,20).forEach( i -> System.out.println(i + " | Wykonywany wątek: " + Thread.currentThread().getName()));
    }
}
