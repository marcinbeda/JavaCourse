package intermediate.functionalProgramming.optional;

import intermediate.functionalProgramming.student.Index;
import intermediate.functionalProgramming.student.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.*;


public class OptionalExample {

    public static void main(String[] args) {

        Supplier<List<Student>> supplyPredefinedStudents = OptionalExample::createData;

        Student student = supplyPredefinedStudents.get().get(0);

        Optional<Index> index = student.getIndex();

        if (index.isPresent()) {
            System.out.println(index.get().getIndexNumber());
        }

        index.ifPresent(i -> {
            System.out.println(i.getIndexNumber());
        });

        if (index.isPresent()) {
            if (index.get().getIndexNumber().equals("123455")) {

            }
        }

        index.map(i -> i.getIndexNumber()).filter(indexNumber -> indexNumber.equals("213")).
                ifPresent(indexNumber -> System.out.println(indexNumber));
    }

    private static List<Student> createData() {
        List<Student> result = new ArrayList<>();

        result.add(new Student("Pawel", 31, "123456"));
        result.add(new Student("John", 29, "67890"));
        result.add(new Student("Billy", 32, "45678"));

        return result;
    }
}
