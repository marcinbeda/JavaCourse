package designPatterns.functionalPatterns.strategy;

/**
 * Created by Marcin Beda.
 */

public class SandwichBreakfastStrategy implements BreakfastStrategy {

    @Override
    public void eatYourBreakfast() {
        System.out.println("Eat sandwich");
    }
}
