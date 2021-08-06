package intermediate.functionalProgramming.streamAPI;

import intermediate.functionalProgramming.student.Student;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Marcin Beda.
 */

public class ReduceExample {

    public static void main(String[] args) {

        Double sumOfRandomDoubles = Stream.generate(Math::random).limit(10).reduce(0.0, Double::sum);

        System.out.println(sumOfRandomDoubles);

        Optional<Integer> maxAgeOfStudent = createDataStream().map(Student::getAge).reduce(Integer::max);

        maxAgeOfStudent.ifPresent(System.out::println);
    }

    private static Stream<Student> createDataStream() {

        Student pawel = new Student("Pawel", 31, "123456");
        Student john = new Student("John", 29, "67890");
        Student billy = new Student("Billy A", 32, "45678");
        Student billy2 = new Student("Billy B", 28, "456782");

        return Stream.of(pawel, john, billy, billy2);
    }
}
