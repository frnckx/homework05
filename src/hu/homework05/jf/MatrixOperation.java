package hu.homework05.jf;
// Létrehoztam a MatrixOperation classt, és implementáltam az IMatrixOperationt
public class MatrixOperation implements IMatrixOperation {
    @Override

    // két for ciklussal végigmegyek a matrix tömbön, ha sor végére ér,
    // akkor a következő elemet új sorba írja. Az elemekhez hozzáfűzök egy szóközt, hogy átláthatóbb legyen a kimenet
    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == matrix[i].length - 1) {
                    System.out.println(matrix[i][j]+" ");
                } else {
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }
}
