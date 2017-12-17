package hu.homework05.jf;

public class Main {
    public static void main(String[] args) {
        //létrehozok egy matrix tömböt a házi feladatban megadott példaszámokkal
        // int[][] matrix = {{1, 0, 1, 1, 1}, {0, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {0, 0, 0, 0, 0}};
        MatrixOperation matrixOperation = new MatrixOperation();
        // matrixOperation.printMatrix(matrix);

        //3. feladat teszt
        int[][] matrix = matrixOperation.initMatrixWithRandomNumbers(5, 6, 5, 9);
        matrixOperation.printMatrix(matrix);

    }
}
