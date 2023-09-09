public class MatrixOperations {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int trace = calculateTrace(matrix);
        double norm = calculateNorm(matrix);

        System.out.println("Trace of the matrix: " + trace);
        System.out.println("Norm of the matrix: " + norm);
    }

    public static int calculateTrace(int[][] matrix) {
        int trace = 0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }
        return trace;
    }
    
    public static double calculateNorm(int[][] matrix) {
        int normSquared = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                normSquared += Math.pow(matrix[i][j], 2);
            }
        }
        return Math.sqrt(normSquared);
    }
}
