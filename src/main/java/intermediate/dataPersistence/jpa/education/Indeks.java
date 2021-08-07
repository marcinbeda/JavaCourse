package intermediate.dataPersistence.jpa.education;

import javax.persistence.*;

/**
 * Created by Marcin Beda.
 */

@Entity
public class Indeks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String number;

    @OneToOne(mappedBy = "indeks")
    private Student owner;

    public Indeks(String number) {
        this.number = number;
    }

    public Indeks() {
    }

    @Override
    public String toString() {
        return "Index{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }

    public Student getOwner() {
        return owner;
    }

    public void setOwner(Student owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }
}
