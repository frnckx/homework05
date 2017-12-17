package hu.homework05.jf;

public class Main {
    public static void main(String[] args) {
        //létrehozok egy matrix tömböt a házi feladatban megadott példaszámokkal
        int[][] matrix = {{1, 0, 1, 1, 1}, {0, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {0, 0, 0, 0, 0}};
        MatrixOperation matrixOperation = new MatrixOperation();
        matrixOperation.printMatrix(matrix);
    }
}
