package basicsPartOne.classAndMethods.overridingMethods;


public class Triangle extends Figure {

    private double a;
    private double h;

    public Triangle(double a, double h) {
        super(a, h);
        this.a = a;
        this.h = h;
    }

    @Override
    // Przeslonienie metody.
    public void calculateArea() {
        System.out.println((a * h) / 2);
    }
}
