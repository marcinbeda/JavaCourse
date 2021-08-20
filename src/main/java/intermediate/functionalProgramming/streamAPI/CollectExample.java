package intermediate.functionalProgramming.streamAPI;

import intermediate.functionalProgramming.student.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;


public class CollectExample {

    public static void main(String[] args) {

        List<Integer> collect = createDataStream().map(Student::getAge).collect(Collectors.toList());

        System.out.println(collect);

        String allAges = createDataStream().map(Student::getAge).map(Object::toString).collect(Collectors.joining(", "));

        System.out.println(allAges);

        Map<Integer, List<Student>> studentsByAge = createDataStream().collect(groupingBy(Student::getAge));

        studentsByAge.forEach((integer, students) -> {
            System.out.println(integer);
            students.stream().map(Student::getName).forEach(System.out::println);
        });
    }

    private static Stream<Student> createDataStream() {

        Student pawel = new Student("Pawel", 31, "123456");
        Student john = new Student("John", 29, "67890");
        Student billy = new Student("Billy A", 32, "45678");
        Student billy2 = new Student("Billy B", 28, "456782");
        Student mark = new Student("Mark", 29, "678901");

        return Stream.of(pawel, john, billy, billy2, mark);
    }
}
