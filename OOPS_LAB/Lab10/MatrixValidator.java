public class MatrixValidator {
    public static boolean isValidMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            return false; // Matrix is empty
        }

        int expectedColumns = matrix[0].length;

        for (int[] row : matrix) {
            if (row.length != expectedColumns) {
                return false; // Number of columns in this row is different from the first row
            }
        }

        return true; // Matrix is valid
    }

    public static void main(String[] args) {
        int[][] validMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] invalidMatrix = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };

        if (isValidMatrix(validMatrix)) {
            System.out.println("The matrix is valid.");
        } else {
            System.out.println("The matrix is not valid.");
        }

        if (isValidMatrix(invalidMatrix)) {
            System.out.println("The matrix is valid.");
        } else {
            System.out.println("The matrix is not valid.");
        }
    }
}
