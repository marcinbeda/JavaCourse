package intermediate.multithreading.basics;


public class CreatingThreads {

    public static void main(String[] args) {

        System.out.println("Główny wątek aplikacji: " + Thread.currentThread().getName());

        Thread thread = new ExampleThread("My-Thread-1");

        thread.start();

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Wykonywany wątek (runnable): " + Thread.currentThread().getName());
//            }
//        };

        Runnable runnable = () -> System.out.println("Wykonywany wątek (runnable): " + Thread.currentThread().getName());


        Thread runnableThread = new Thread(runnable, "My-Runnable-1");

        runnableThread.start();
    }
}
