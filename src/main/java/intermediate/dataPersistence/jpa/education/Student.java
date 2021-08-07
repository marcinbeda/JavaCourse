package intermediate.dataPersistence.jpa.education;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Marcin Beda.
 */

@Entity
@NamedQueries({
        @NamedQuery(name = "Student.getAll", query = "SELECT s FROM Student s"),
        @NamedQuery(name = "Student.byName", query = "SELECT s FROM Student s WHERE s.name = :name")

})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String telephone;

    @Embedded
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    private Indeks indeks;

    @ManyToMany
    private Set<Classes> classes;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String indexNumber) {
        this.name = name;
        this.indeks = new Indeks(indexNumber);
        this.classes = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
//                ", indeks=" + indeks +
                '}';
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setIndeks(Indeks idx) {
        this.indeks = idx;
    }

    public Indeks getIndeks() {
        return indeks;
    }

    public void addClasses(Classes classes) {
        this.classes.add(classes);
    }
}
