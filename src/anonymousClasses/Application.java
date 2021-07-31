package anonymousClasses;

/**
 * Created by Marcin Beda.
 */

public class Application {
    public static void main(String[] args) {

        Computer computer = new Computer() {
            @Override
            public void loadOS() {
                System.out.println("Laduje Ubuntu");
            }
        };
        computer.loadOS();

        Human human = new Human() {
            @Override
            public void think() {
                System.out.println("Czlowiek mysli...");
            }
        };
        human.think();
    }
}

class Computer {

    public void loadOS() {
        System.out.println("Laduje Windows");
    }
}

interface Human {
    void think();
}