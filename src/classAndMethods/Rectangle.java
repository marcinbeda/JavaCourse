package classAndMethods;

/**
 * Created by Marcin Beda.
 */

public class Rectangle {

    private int a, b;
    private String rectangleName;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(int a, int b, String rectangleName) {
        this.a = a;
        this.b = b;
        this.rectangleName = rectangleName;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getRectangleName() {
        return rectangleName;
    }

    public void setRectangleName(String rectangleName) {
        this.rectangleName = rectangleName;
    }

    public void test() {
        System.out.println("Hello World");
    }

    public void test(String text) {
        System.out.println(text);
    }

    public int test(int a, int b) {
        return a * b;
    }
}
