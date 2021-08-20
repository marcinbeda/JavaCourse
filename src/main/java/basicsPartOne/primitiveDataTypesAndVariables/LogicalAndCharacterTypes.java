package basicsPartOne.primitiveDataTypesAndVariables;


public class LogicalAndCharacterTypes {

    /**
     * Strona z listą wszystkich znaków Unicode:
     * http://unicode-table.com/en/#control-character
     */


    char c1 = 0, c2 = 65535; // rozmiar 16 bitów (2 bajty)

    char c3 = 'A', c4 = 65, c5 = 0041, c6 = '\u0041', c7 = 64 + 1;

    String string = "\u0041BCD";

    boolean b1 = true, b2 = false; // rozmiar 8 bitów (1 bajt)
}
