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
        Sort sort = new Sort();
//4. A teszteléshez 2 tömböt is létrehoztam, az egyik már eleve sorban van, a másik nem
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 8, 3, 7, 5, 3, 2, 1};
        sort.bubbleSort(array);
        sort.bubbleSort(array2);
        for (int i = 0; i < array2.length; i++) {

            System.out.print(array2[i]+" ");

        }
    }
}
