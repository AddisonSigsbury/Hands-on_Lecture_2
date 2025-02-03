import java.util.LinkedList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralMatrix(int[][] matrix) {
        List<Integer> retList = new LinkedList<>();
        int top = 0; // top boundary is 0
        int bottom = matrix.length - 1; // bottom boundary is set to the length of the matrix
        int right = matrix[0].length - 1; // right boundary is set to the width of the matrix
        int left = 0; // left boundary is 0

        while(top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) // traverse through the top row left to right and add all values to list
                retList.add(matrix[top][i]);
            top++;

            for (int i = top; i<= bottom; i++) // do the same for the right column
                retList.add(matrix[i][right]);
            right--;

            if (top <= bottom) { // if top and bottom boundaries aren't touching yet, then add bottom row right to left
                for (int i = right; i >= left; i--)
                    retList.add(matrix[bottom][i]);
                bottom--;
            }

            if (left <= right) { // if left and right boundaries aren't touching yet then add left column bottom up
                for (int i = bottom; i>= top; i--)
                    retList.add(matrix[i][left]);
                left++;
            }
        }
        return retList;
    }

    public static void main(String[] args) {
        int[][] sample = {{1,2,3}, {8,9,4}, {7,6,5}}; // test cases
        List<Integer> example = spiralMatrix(sample);
        System.out.println("Spiral Matrix List should print 1-9 in ascending order: " + example);

        int[][] sample2 = {{1,2,3,4},{10,11,12,5},{9,8,7,6}};
        List<Integer> example2 = spiralMatrix(sample2);
        System.out.println("Spiral Matrix List should print 1-12 in ascending order: " + example2);
    }
}
