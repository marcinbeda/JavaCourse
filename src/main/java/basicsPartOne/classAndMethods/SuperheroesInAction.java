package basicsPartOne.classAndMethods;


public class SuperheroesInAction {
    public static void main(String[] args) {

        Superhero superhero = new Superhero();
        superhero.setHealthPoints(100);
        superhero.setStrength(10);
        superhero.setDexterity(20);
        superhero.setEndurance(30);

        Batman batman = new Batman(300, 20, 10, 20, true);
        batman.useBatmobil();
        batman.setStrength(20);

        Spiderman spiderman = new Spiderman(200, 10, 20, 15);
        spiderman.wallsWalking();
        spiderman.setEndurance(30);
    }
}
