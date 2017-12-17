package hu.homework05.jf;

import java.util.Random;

// Létrehoztam a MatrixOperation classt, és implementáltam az IMatrixOperationt
public class MatrixOperation implements IMatrixOperation {
    @Override

    // két for ciklussal végigmegyek a matrix tömbön, ha sor végére ér,
    // akkor a következő elemet új sorba írja. Az elemekhez hozzáfűzök egy szóközt, hogy átláthatóbb legyen a kimenet
    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == matrix[i].length - 1) {
                    System.out.println(matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    @Override
    //3. Létrehozok egy matrix tömböt a megadott paraméterekkel, majd feltöltöm random számokkal
    public int[][] initMatrixWithRandomNumbers(int n, int m, int min, int max) {
        int[][] matrix = new int[n][m];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                {

                    matrix[i][j] = random.nextInt((max - min) + 1) + min;
                }
            }
        }
        return matrix;

    }
}
