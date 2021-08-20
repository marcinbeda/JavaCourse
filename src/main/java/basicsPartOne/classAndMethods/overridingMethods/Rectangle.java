package basicsPartOne.classAndMethods.overridingMethods;


public class Rectangle extends Figure {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    @Override
    // Przeslonienie metody.
    public void calculateArea() {
        System.out.println(a * b);
    }
}
