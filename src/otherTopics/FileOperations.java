package otherTopics;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Marcin Beda.
 */

public class FileOperations {

    public static void main(String[] args) throws IOException {

        File file = new File("src/otherTopics/File.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        try {
            bufferedWriter.write("To jest przykładowe zapisywanie danych do pliku.");
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Wystąpił błąd IOException.");
        }

        FileWriter fileWriter = new FileWriter(file, true);
        bufferedWriter = new BufferedWriter(fileWriter);
        try {
            bufferedWriter.write("\nTo jest nowy tekst.");
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Wystąpił błąd IOException.");
        }

        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String line = bufferedReader.readLine();
            bufferedReader.close();

            System.out.println(line);

        } catch (IOException ex) {
            System.out.println("Wystąpił błąd IOException.");
        }

        Scanner scanner = new Scanner(file);
        String s = scanner.nextLine();
    }
}
