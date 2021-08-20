package designPatterns.functionalPatterns.strategy;


public class SandwichBreakfastStrategy implements BreakfastStrategy {

    @Override
    public void eatYourBreakfast() {
        System.out.println("Eat sandwich");
    }
}
