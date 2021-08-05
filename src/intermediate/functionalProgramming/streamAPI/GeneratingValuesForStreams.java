package intermediate.functionalProgramming.streamAPI;

import intermediate.functionalProgramming.student.Student;

import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Marcin Beda.
 */

public class GeneratingValuesForStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::println;

        Stream.of("A", "C", "D", "C").forEach(print);

        Stream<Student> stream = createDataStream();

        Stream.generate(() -> Math.random()).limit(10).forEach(System.out::println);

        Stream.iterate(0, i -> i + 2).limit(20).forEach(System.out::println);

        IntStream.range(5, 100).filter(i -> i % 2 == 0).forEach(System.out::println);
    }

    private static Stream<Student> createDataStream() {

        Student pawel = new Student("Pawel", 31, "123456");
        Student john = new Student("John", 29, "67890");
        Student billy = new Student("Billy", 32, "45678");

        return Stream.of(pawel, john, billy);
    }
}
