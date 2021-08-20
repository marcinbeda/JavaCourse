package intermediate.functionalProgramming.streamAPI;

import intermediate.functionalProgramming.student.Index;
import intermediate.functionalProgramming.student.Student;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class ForEachMapFilterExample {

    public static void main(String[] args) {

        Predicate<Student> over30 = student -> student.getAge() > 30;

        StringBuilder sb = new StringBuilder("");

        createDataStream()
                .filter(over30)
                .map(Student::getName)
                .filter(name -> name.startsWith("Billy"))
                .map(String::toUpperCase)
                .forEach(sb::append);

        createDataStream()
                .map(Student::getIndex)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(Index::getIndexNumber)
                .forEach(System.out::println);
    }

    private static Stream<Student> createDataStream() {

        Student pawel = new Student("Pawel", 31, "123456");
        Student john = new Student("John", 29, "67890");
        Student billy = new Student("Billy A", 32, "45678");
        Student billy2 = new Student("Billy B", 28, "456782");

        return Stream.of(pawel, john, billy, billy2);
    }
}
