package intermediate.dataPersistence.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marcin Beda.
 */

public class JDBCExample {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        createTableForStudent();

        Student student1 = new Student(1, "Martin");
        Student student2 = new Student(2, "Laura");

        insertStudent(student1);
        insertStudent(student2);

        List<Student> students = getStudents();

        students.forEach(System.out::println);
    }

    private static void createTableForStudent() throws SQLException, ClassNotFoundException {

        Connection connection = H2Configuration.getDBConnection();

        Statement statement = connection.createStatement();

        String createTable = "CREATE TABLE STUDENT(id int primary key, name varchar(255))";

        statement.execute(createTable);

        connection.commit();
    }

    private static void insertStudent(Student student) throws SQLException, ClassNotFoundException {

        Connection connection = H2Configuration.getDBConnection();

        Statement statement = connection.createStatement();

        String insert = "INSERT INTO STUDENT VALUES("+student.getId()+",\'"+student.getName()+"\')";

        statement.execute(insert);

        connection.commit();

    }

    public static List<Student> getStudents() throws SQLException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();

        Connection connection = H2Configuration.getDBConnection();

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM STUDENT");

        while (resultSet.next()) {

            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");

            students.add(new Student(id,name));
        }
        return students;
    }
}
