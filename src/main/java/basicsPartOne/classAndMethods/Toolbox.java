package basicsPartOne.classAndMethods;


public class Toolbox {

    public static final double PHI = (1 + Math.sqrt(5)) / 2;

    public static double nElementOfFibonacciSequence(int n) {
        return (Math.pow(PHI, n) - Math.pow((1 - PHI), n)) / Math.sqrt(5);
    }
}
