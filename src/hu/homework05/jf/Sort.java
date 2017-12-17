package hu.homework05.jf;

public class Sort implements ISort {
//4.feladat: a pseudocode alapján optimalizáltam a kódot, a teszteléshez kiírattam vele a cserék számát, illetve
// ha nem volt szükség cserére, akkor hogy breakkel megszakadt a futás
    @Override
    public void bubbleSort(int[] array) {
        int swaps = 0;
        for (int i = array.length - 1; i >= 1; i--) {

            for (int j = 0; j <= i - 1; j++) {

                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                    swaps++;
                    System.out.println("swaps: "+swaps);
                }

            }
            if (swaps == 0){
                System.out.println("Break");
                break;

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
