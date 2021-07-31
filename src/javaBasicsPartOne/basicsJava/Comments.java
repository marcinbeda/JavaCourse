package javaBasicsPartOne.basicsJava;

/**
 * Created by Marcin Beda.
 */

public class Comments {

    int x;
    int y;

    /**
     * To jest konstruktor klasy Komentarze.
     * @param x
     * @param y
     */
    public Comments(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Metoda main.
     * @param args
     */
    public static void main(String[] args) {

        // To jest komentarz jednowierszowy.

    	/* To jest komentarz wielowierszowy w jednym wierzu. */

    	/*
    	To jest komentarz wielowierszowy
    	w wielu wierszach
    	(w tym przypadku w dwoch... tzn. juz w trzech... a raczej w pieciu)
		*/

        /**
         * To jest komentarz dokumentujacy.
         */
    }

    /**
     * To jest metoda mnozaca przez siebie dwie wartosci.
     * @param x Parametr nr 1.
     * @param y Parametr nr 2.
     * @return Iloczyn x i y.
     */
    private int multiply(int x, int y) {
        return x * y;
    }
}
