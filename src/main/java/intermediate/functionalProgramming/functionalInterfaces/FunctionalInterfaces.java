package intermediate.functionalProgramming.functionalInterfaces;

import intermediate.functionalProgramming.student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;


public class FunctionalInterfaces {

    public static void main(String[] args) {

        Predicate<Student> over30 = student -> student.getAge() > 30;
        Consumer<String> print = text -> System.out.println(text);
        Supplier<List<Student>> supplyPredefinedStudents = () -> createData();
        Function<Student, String> getStudentName = student -> student.getName();

        // Method References
//        Predicate<Student> over30 = student -> student.getAge()>30;
//        Consumer<String> print = System.out::println;
//        Supplier<List<Student>> supplyPredefinedStudents = FunctionalInterfaces::createData;
//        Function<Student,String> getStudentName = Student::getName;
//        BiFunction<Student, String, Student> changeIndex = Student::changeIndexNumber;

        // Example primitive functional interface
        ToIntFunction<Student> getAge = new ToIntFunction<Student>() {
            @Override
            public int applyAsInt(Student value) {
                return value.getAge();
            }
        };

        consumeStudents(filterStudents(supplyPredefinedStudents, over30), getStudentName, print);
    }

    private static void consumeStudents(List<Student> students, Function<Student, String> function, Consumer<String> consumer) {
        for (Student s : students) {
            consumer.accept(function.apply(s));
        }
    }

    private static List<Student> filterStudents(Supplier<List<Student>> supplier, Predicate<Student> predicate) {
        List<Student> result = new ArrayList<>();

        List<Student> students = supplier.get();

        for (Student s : students) {
            if (predicate.test(s)) {
                result.add(s);
            }
        }

        return result;
    }

    private static List<Student> createData() {
        List<Student> result = new ArrayList<>();

        result.add(new Student("Pawel", 31, "123456"));
        result.add(new Student("John", 29, "67890"));
        result.add(new Student("Billy", 32, "45678"));

        return result;
    }
}
