package basicsPartTwo.elseIfStatment;


public class ElseIfStatment {

    public static void main(String[] args) {
        int number = 0;

        if (number > 0) {
            System.out.println("Liczba większa od zera");
        } else if (number == 0) {
            System.out.println("Liczba jest równa zero");
        } else {
            System.out.println("Liczba mniejsza od zera");
        }
    }
}
