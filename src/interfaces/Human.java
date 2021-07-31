package interfaces;

/**
 * Created by Marcin Beda.
 */

public class Human implements Informations, CognitiveProcess {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void oddychaj() {
        System.out.println(name + " zaczal oddychac.");
    }

    @Override
    public void showInformations() {
        System.out.println("Imie czlowieka, to: " + name);
    }

    @Override
    public void think() {
        System.out.println(name + " teraz mysli.");
    }
}
