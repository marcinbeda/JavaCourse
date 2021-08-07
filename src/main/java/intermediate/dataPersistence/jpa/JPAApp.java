package intermediate.dataPersistence.jpa;

import intermediate.dataPersistence.jpa.education.Student;
import intermediate.dataPersistence.jpa.education.University;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Marcin Beda.
 */

public class JPAApp {

    static EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExampleNameDev");

    static EntityManager entityManager = factory.createEntityManager();

    public static void main(String[] args) {

//        // CRUD
//        // Create
//        createStudent();
//        // Read
//        readStudents();
//        // Update
//        updateStudent();
//        // Delete
//        deleteStudent();

        createData();

//        entityManager.createQuery("SELECT s from University s").getResultList();

//        entityManager.createQuery("SELECT s FROM Student s WHERE s.name IN ('Pawel','John')").getResultList().forEach(System.out::println);

//        TypedQuery<Indeks> query = entityManager.createQuery("SELECT s.indeks FROM Student s WHERE s.name = :studentName", Indeks.class);
//        query.setParameter("studentName", "John");
//        System.out.println(query.getSingleResult());

//        Query query1 = entityManager.createQuery("SELECT s.name, s.indeks.number FROM Student s WHERE s.name IN ('Pawel','John')");
//        TypedQuery<QueryResult> query = entityManager.createQuery("SELECT new intermediate.dataPersistence.jpa.QueryResult(s.name, s.indeks.number) FROM Student s WHERE s.name IN ('Pawel','John')", QueryResult.class);
//        query.getResultList().forEach(System.out::println);

//        List<CountResult> resultList = entityManager.createQuery("SELECT new intermediate.dataPersistence.jpa.CountResult(s.name, COUNT(s)) FROM Student s GROUP BY s.name HAVING s.name IN ('Pawel', 'John') ORDER BY s.name", CountResult.class).getResultList();

//        entityManager.createNamedQuery("Student.getAll", Student.class).getResultList().forEach(System.out::println);
//        entityManager.createNamedQuery("Student.byName", Student.class).setParameter("name","John").getResultList().forEach(System.out::println);
    }

    private static void createData() {

/*        // Example for OneToOne
        entityManager.getTransaction().begin();
        Student pawel = entityManager.merge(new Student("Pawel"));
        Indeks indeks = entityManager.merge(new Indeks("123456"));

        System.out.println(pawel);

        pawel.setIndeks(indeks);

        pawel = entityManager.merge(pawel);

        indeks.setOwner(pawel);
        Indeks mergeIndex = entityManager.merge(indeks);
        entityManager.getTransaction().commit();
        System.out.println(pawel);
        Indeks idx = entityManager.find(Indeks.class, mergeIndex.getId());
        System.out.println(idx);
 */


/*        // Example for OneToMany
                entityManager.getTransaction().begin();

        Student pawel = entityManager.merge(new Student("Pawel", "123456"));

        Student merge = entityManager.merge(pawel);

        entityManager.getTransaction().commit();

        System.out.println(pawel);
        System.out.println(pawel.getIndeks());

        entityManager.getTransaction().begin();

        University umk = entityManager.merge(new University("UMK"));

        umk.addStudent(pawel);

        entityManager.getTransaction().commit();
 */


/*        // Example for ManyToOne and ManyToMany
         entityManager.getTransaction().begin();

        Student pawel = entityManager.merge(new Student("Pawel", "123456"));

        University umk = entityManager.merge(new University("UMK"));

        pawel.setUniversity(umk);
        umk.addStudent(pawel);

        entityManager.merge(pawel);
        entityManager.merge(umk);

        entityManager.getTransaction().commit();

        University university = entityManager.find(University.class, umk.getId());

        System.out.println(university);
*/

        // Example for FETCH LAZY
        entityManager.getTransaction().begin();

        Student pawel = entityManager.merge(new Student("Pawel", "123456"));
        Student john = entityManager.merge(new Student("John", "654321"));

        University university = entityManager.merge(new University("UKW"));

        university.addStudent(pawel);
        university.addStudent(john);

        entityManager.merge(university);

        entityManager.getTransaction().commit();

        entityManager.clear();
    }

    private static void deleteStudent() {

        Student student = entityManager.find(Student.class, 1);
        entityManager.getTransaction().begin();
        entityManager.remove(student);
        entityManager.getTransaction().commit();
    }

    private static void updateStudent() {

        Student kinga = new Student("Kinga");

        entityManager.getTransaction().begin();
        Student student = entityManager.merge(kinga);

        student.setTelephone("1234567");

        entityManager.merge(student);

        entityManager.getTransaction().commit();
    }

    private static void readStudents() {

        Student student = entityManager.find(Student.class, 0);

        System.out.println(student);

        List fromStudent = entityManager.createQuery("SELECT s from Student s").getResultList();

        fromStudent.forEach(System.out::println);
    }

    private static void createStudent() {

        Student pawel = new Student("Pawel");

        entityManager.getTransaction().begin();
        entityManager.persist(pawel);
        entityManager.getTransaction().commit();
    }
}
