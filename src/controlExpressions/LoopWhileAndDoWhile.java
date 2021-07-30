package controlExpressions;

/**
 * Created by Marcin Beda.
 */

public class LoopWhileAndDoWhile {
    public static void main(String[] args) {

        int iterator = 2;

        while (iterator == 2) {
            System.out.println("Jestem w petli While");
            iterator++;
        }

        do {
            System.out.println("Jestem w petli Do-While");
            iterator++;
        } while (iterator == 4);

    }
}
