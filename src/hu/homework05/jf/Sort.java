package hu.homework05.jf;

public class Sort implements ISort {

    @Override
    public void bubbleSort(int[] array) {
        for (int i = array.length - 1; i >= 1; i--) {

            for (int j = 0; j <= i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;

                }
            }

        }
    }


    @Override
    public void insertionSort(int[] array) {

    }

    @Override
    public void selectionSort(int[] array) {

    }

    @Override
    public void mergeSort(int[] array) {

    }

    @Override
    public void quickSort(int[] array) {

    }
}
