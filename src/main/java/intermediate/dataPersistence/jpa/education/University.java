package intermediate.dataPersistence.jpa.education;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Marcin Beda.
 */

@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Student> students;

    public University() {
    }

    public University(String name) {
        this.students = new HashSet<>();
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public int getId() {
        return this.id;
    }
}
