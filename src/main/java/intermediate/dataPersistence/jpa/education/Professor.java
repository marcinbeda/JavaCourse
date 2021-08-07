package intermediate.dataPersistence.jpa.education;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Marcin Beda.
 */

@Entity
public class Professor {

    @Id
    private int id;

    private String name;

    private String telephone;

    @Embedded
    private Address address;

    public Professor() {
    }

    public Professor(int id, String name) {
        this.id = id;
        this.name = name;
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
                '}';
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
