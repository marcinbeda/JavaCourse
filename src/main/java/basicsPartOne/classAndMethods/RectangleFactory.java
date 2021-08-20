package basicsPartOne.classAndMethods;


public class RectangleFactory {
    public static void main(String[] args) {

        Rectangle rectangleOne = new Rectangle(10, 5);
        Rectangle rectangleTwo = new Rectangle(4, 2);

        Rectangle newRectangle = new Rectangle(5, 3, "Nowy prostokat");
        System.out.println(newRectangle.getRectangleName());

        newRectangle.test();
        newRectangle.test("Korzystam z drugiej metody test()");
        int rectangleArea = newRectangle.test(newRectangle.getA(), newRectangle.getB());
        System.out.println(rectangleArea);
    }
}
