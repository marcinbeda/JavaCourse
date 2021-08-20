package intermediate.functionalProgramming.streamAPI;

import intermediate.functionalProgramming.student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;


public class StreamExample {

    public static void main(String[] args) {

        Predicate<Student> over30 = student -> student.getAge() > 30;
        Consumer<String> print = System.out::println;
        Supplier<List<Student>> supplyPredefinedStudents = StreamExample::createData;
        Function<Student, String> getStudentName = Student::getName;

//        consumeStudents(filterStudents(supplyPredefinedStudents, over30),getStudentName,print);

        supplyPredefinedStudents.get().stream().filter(over30).map(getStudentName).forEach(print);
    }

    private static List<Student> createData() {
        List<Student> result = new ArrayList<>();

        result.add(new Student("Pawel", 31, "123456"));
        result.add(new Student("John", 29, "67890"));
        result.add(new Student("Billy", 32, "45678"));

        return result;
    }
}
