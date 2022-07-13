import java.util.Objects;

public class Index {
    int row;
    int col;
    public Index(int rowIndex, int colIndex) {
       super();
        this.row = rowIndex;
        this.col = colIndex;
    }   

     @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Index cell = (Index) o;
            return row == cell.row &&
                    col == cell.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }
}   