import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>(); // List to return pascals triangle

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(); // new row to add to the list
            for (int j = 0; j <= i; j++) {
                if (j != 0 && j != i) // if pointer is not at either end of the triangle, then add upper two values
                   row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                else // otherwise just store 1 into the row
                    row.add(1);
            }
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        List<List<Integer>> sample = generate(2); // Test cases
        System.out.println("Pascal's Triangle with 2 rows: " + sample);

        List<List<Integer>> sample2 = generate(5);
        System.out.println("Pascal's Triangle with 5 rows: " + sample2);

        List<List<Integer>> sample3 = generate(7);
        System.out.println("Pascal's Triangle with 7 rows: " + sample3);

        List<List<Integer>> sample4 = generate(11);
        System.out.println("Pascal's Triangle with 11 rows: " + sample4);
    }
}