package basicsPartTwo.inheritanceMethods;

/**
 * Created by Marcin Beda.
 */

public class Animal {
    public Animal(String name) {
        this.name = name;
    }

    String name;

    public void getVoice() {
        System.out.println("Default voice");
    }
}
