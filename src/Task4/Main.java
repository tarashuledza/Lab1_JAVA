package Task4;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {1, 2, 3, 7},
                {3, 6, 7, 6},
                {3, 1, 1, 9}
        };
        int[][] resultMatrix = multiplyMatrix(matrix1, matrix2);
        printMatrix(resultMatrix);
    }

    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int rowsMatrix1 = matrix1.length;
        int colsMatrix1 = matrix1[0].length;
        int colsMatrix2 = matrix2[0].length;

        if (colsMatrix1 != matrix2.length) {
            throw new IllegalArgumentException("The number of columns of the first matrix must be equal to the number of rows of the second matrix");
        }

        int[][] result = new int[rowsMatrix1][colsMatrix2];

        for (int i = 0; i < rowsMatrix1; i++) {
            for (int j = 0; j < colsMatrix2; j++) {
                int sum = 0;
                for (int k = 0; k < colsMatrix1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("[");
            for (int value : row) {
                System.out.print(value + ", ");
            }
            System.out.println("]");
        }
    }
}
