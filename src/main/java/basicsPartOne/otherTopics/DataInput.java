package basicsPartOne.otherTopics;

import java.util.Scanner;


public class DataInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight;
        double heigh;
        double bmi;

        System.out.println("Podaj swoja wage w kg:");
        weight = input.nextDouble();

        System.out.println("Podaj swoj wzrost w cm:");
        heigh = input.nextDouble();

        bmi = weight / Math.pow((heigh / 100), 2);

        System.out.printf("Twoje BMI, to: %.2f \n\n", bmi);

        System.out.println("< 18.5 - niedowaga");
        System.out.println("18.5 - 24.99 - waga prawidlowa");
        System.out.println(">= 25.0 - nadwaga");
    }
}
