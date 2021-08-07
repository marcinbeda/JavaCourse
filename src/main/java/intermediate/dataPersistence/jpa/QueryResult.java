package intermediate.dataPersistence.jpa;

/**
 * Created by Marcin Beda.
 */

public class QueryResult {

    private String studentName;
    private String indeksNumber;

    public QueryResult(String studentName, String indeksNumber) {
        this.studentName = studentName;
        this.indeksNumber = indeksNumber;
    }

    @Override
    public String toString() {
        return "QueryResult{" +
                "studentName='" + studentName + '\'' +
                ", indeksNumber='" + indeksNumber + '\'' +
                '}';
    }
}
