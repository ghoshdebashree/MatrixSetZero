
public class MatrixSetZeroImp {
public static void setMatrixZero(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    boolean[] rowZero = new boolean[rows];
    boolean[] colsZero = new boolean[cols];
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] == 0) {
                rowZero[i] = true;
                colsZero[i] = true;
            }
        }
    }
    for (int i = 0; i < rows; i++) {
        if (rowZero[i]) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 0;
            }
        }
    }
    for (int j = 0; j < cols; j++) {
        if (colsZero[j]) {
            for (int i = 0; i < rows; i++) {
                matrix[i][j] = 0;
            }
        }
    }
}
    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setMatrixZero(matrix);

        System.out.println("\nMatrix after setting zeros:");
        printMatrix(matrix);
    }
}
