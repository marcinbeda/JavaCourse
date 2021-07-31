package lambdaExpressions;

/**
 * Created by Marcin Beda.
 */

public class Application {
    public static void main(String[] args) {

        Human human_1 = new Human() {
            @Override
            public void think() {
                System.out.println("Czlowiek mysli...");
            }
        };
        human_1.think();

        Corporation corporation = new Corporation();
        corporation.manage(new Human() {
            @Override
            public void think() {
                System.out.println("Czlowiek mysli...");
            }
        });

        corporation.manage(() -> System.out.println("Czlowiek mysli..."));
    }
}

class Corporation {
    public void manage(Human cz) {
        System.out.println("Zarzadzanie zasobami aktywne.");
        cz.think();
    }

}

interface Human {
    void think();
}
