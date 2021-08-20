package intermediate.functionalProgramming.streamAPI;

import intermediate.functionalProgramming.student.Student;

import java.util.function.Predicate;
import java.util.stream.Stream;


public class FindFirstAnyMachAllMachNoneMatchExample {

    public static void main(String[] args) {

        Predicate<Student> over30 = student -> student.getAge() > 30;

        createDataStream()
                .filter(over30)
                .map(Student::getName)
                .findFirst().ifPresent(student -> System.out.println("Mamy studenta po 30"));

        boolean anyMatchExample = createDataStream()
                .map(Student::getName)
                .anyMatch(name -> name.equals("John"));

        boolean allMatchExample = createDataStream()
                .map(Student::getAge)
                .allMatch(age -> age > 25);

        boolean noneMatchExample = createDataStream()
                .map(Student::getAge)
                .noneMatch(age -> age < 55);

        System.out.println(anyMatchExample);
        System.out.println(allMatchExample);
        System.out.println(noneMatchExample);
    }

    private static Stream<Student> createDataStream() {

        Student pawel = new Student("Pawel", 31, "123456");
        Student john = new Student("John", 29, "67890");
        Student billy = new Student("Billy A", 32, "45678");
        Student billy2 = new Student("Billy B", 28, "456782");

        return Stream.of(pawel, john, billy, billy2);
    }
}
