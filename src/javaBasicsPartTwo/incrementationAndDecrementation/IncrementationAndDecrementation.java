package javaBasicsPartTwo.incrementationAndDecrementation;

/**
 * Created by Marcin Beda.
 */

public class IncrementationAndDecrementation {

    public static void main(String[] args) {
        int a = 5;
//      a += 1;
        a++;

        System.out.println(a++);
        System.out.println(++a);

        a--;
        System.out.println(--a);
    }
}
