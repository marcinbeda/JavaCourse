
package intermediate.functionalProgramming.streamAPI;

import intermediate.functionalProgramming.student.Student;

import java.util.stream.IntStream;
import java.util.stream.Stream;


public class PrimitiveTypesStreams {

    public static void main(String[] args) {

        IntStream intStream = createDataStream().map(Student::getAge).mapToInt(Integer::intValue);
        intStream.sorted().forEach(System.out::println);
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
