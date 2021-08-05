package basicsPartOne.otherTopics;

/**
 * Created by Marcin Beda.
 */

public class Enums {

//    public static final int BATMAN = 0;
//    public static final int SUPERMAN = 1;
//    public static final int WONDER_WOMAN = 2;

    public static void main(String[] args) {

        Superhero superhero = Superhero.BATMAN;

        switch (superhero) {
            case BATMAN:
                break;
            case SUPERMAN:
                break;
            case WONDER_WOMAN:
                break;
            default:
                break;
        }

        System.out.println("Moc Batmana, to: " + Superhero.BATMAN.getPower());
    }
}
