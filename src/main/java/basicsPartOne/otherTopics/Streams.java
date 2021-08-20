package basicsPartOne.otherTopics;

import java.util.ArrayList;
import java.util.Random;


public class Streams {
    public static void main(String[] args) {

        // Utworzenie setu danych.
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random randomGenerator = new Random();
        for (int i = 0; i < 100; i++) {
            arrayList.add(randomGenerator.nextInt());
        }

        // 1. Tradycyjne podejscie.
        long start = System.currentTimeMillis();

        int result = 0;
        for (int i : arrayList) {
            result += isPrime(i);
        }

        long end = System.currentTimeMillis() - start;

        System.out.println("From 100 numbers, " + result + " are prime.");
        System.out.println("Execution time in ms: " + end);

        // 2. Strumien.
        System.out.println("=================");

        start = System.currentTimeMillis();

        result = arrayList.stream().map(Streams::isPrime).reduce(Integer::sum).get();

        end = System.currentTimeMillis() - start;

        System.out.println("From 100 numbers, " + result + " are prime.");
        System.out.println("Execution time in ms: " + end);

        // 3. Strumien rownolegly.
        System.out.println("=================");

        start = System.currentTimeMillis();

        result = arrayList.parallelStream().map(Streams::isPrime).reduce(Integer::sum).get();

        end = System.currentTimeMillis() - start;

        System.out.println("From 100 numbers, " + result + " are prime.");
        System.out.println("Execution time in ms: " + end);
    }

    public static int isPrime(int n) {
        n = Math.abs(n);
        for (int i = 2; i < n; i++) if (n % i == 0) return 0;
        return 1;
    }
}
