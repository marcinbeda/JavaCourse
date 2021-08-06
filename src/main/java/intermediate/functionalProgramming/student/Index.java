package intermediate.functionalProgramming.student;

import java.util.Objects;

/**
 * Created by Marcin Beda.
 */

final public class Index {

    private String indexNumber;

    public Index(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Index index = (Index) o;
        return Objects.equals(indexNumber, index.indexNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexNumber);
    }
}
