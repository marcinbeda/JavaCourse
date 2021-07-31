package javaBasicsPartOne.primitiveDataTypesAndVariables;

/**
 * Created by Marcin Beda.
 */

public class PrimitiveTypes {

    public static void main(String[] args) {

//        int x = 10;
//        Class y = new Class(10);

        // Zapisz czas na poczatku.
        long start = System.currentTimeMillis();

        // Odliczaj od 0 do 10^9 i dodawaj do siebie odliczane wartosci.
        long sum = 0L;
        for(long i = 0; i <= 1000000000; i++) {
            sum += i;
        }
        System.out.println("Suma wynosi: " + sum);

        // Zapisz czas na koncu.
        long stop = System.currentTimeMillis();

        // Wyswietl czas wykonania.
        System.out.println("Czas wykonania w ms: " + (stop - start));
    }
}
