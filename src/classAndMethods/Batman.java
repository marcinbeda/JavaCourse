package classAndMethods;

/**
 * Created by Marcin Beda.
 */

public class Batman extends Superhero {

    private boolean batmobil;

    public Batman() {
        super();
    }

    public Batman(int healthPoints, int strength, int dexterity, int endurance, boolean batmobil) {
        super(healthPoints, strength, dexterity, endurance);
        this.batmobil = batmobil;
    }

    public void useBatmobil() {
        if (batmobil) {
            System.out.println("Batmobil zostal uzyty.");
        } else {
            System.out.println("Batmobil zostal w garazu.");
        }
    }
}
