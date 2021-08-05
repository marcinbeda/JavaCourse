package intermediate.functionalProgramming.streamAPI;

import intermediate.functionalProgramming.student.Student;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by Marcin Beda.
 */

public class LimitSkipDistinctSortedCountExample {

    public static void main(String[] args) {

        // limit
        createDataStream().limit(2).map(Student::getName).forEach(System.out::println);
        // skip
        createDataStream().skip(2).map(Student::getName).forEach(System.out::println);
        // distinct
        createDataStream().distinct().map(Student::getName).forEach(System.out::println);
        // sorted
        createDataStream().sorted().map(Student::getName).forEach(System.out::println);
        // count
        long count = createDataStream().sorted(Comparator.comparingInt(Student::getAge)).map(Student::getName).count();

        System.out.println(count);
    }

    private static Stream<Student> createDataStream() {

        Student pawel = new Student("Pawel", 31, "123456");
        Student john = new Student("John", 29, "67890");
        Student billy = new Student("Billy A", 32, "45678");
        Student billy2 = new Student("Billy B", 28, "45678");
        Student mark = new Student("Mark", 29, "678901");
        Student martha = new Student("Martha", 29, "678901");

        return Stream.of(pawel, john, billy, billy2, mark, martha);
    }
}
