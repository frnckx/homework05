package hu.homework05.jf;
// létrehoztam az interface-t az UML alapján
public interface IMatrixOperation {

    void printMatrix(int[][]matrix);
    int [][] initMatrixWithRandomNumbers(int n, int m, int min, int max);
}
