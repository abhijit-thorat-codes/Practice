import java.util.Arrays;

public class Quick{

    public static void main(String args[]) {

        // unsorted integer array
        long[] unsorted = {1537890594, 1540204583, 1538753144, 1537892051, 1538785937, 1537415630};
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));

        QuickSort algorithm = new QuickSort ();

        // sorting integer array using quicksort algorithm
        algorithm.sort(unsorted);

        // printing sorted array
        System.out.println("Sorted array :" + Arrays.toString(unsorted));

    }

}


class QuickSort{

    private long input[];
    private int length;

    public void sort(long[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return;
        }
        this.input = numbers;
        length = numbers.length;
        quickSort(0, length - 1);
    }

    /*
     * This method implements in-place quicksort algorithm recursively.
     */
    private void quickSort(int low, int high) {
        int i = low;
        int j = high;

        // pivot is middle index
        long pivot = input[low + (high - low) / 2];

        // Divide into two arrays
        while (i <= j) {
            /**
             * As shown in above image, In each iteration, we will identify a
             * number from left side which is greater then the pivot value, and
             * a number from right side which is less then the pivot value. Once
             * search is complete, we can swap both numbers.
             */
            while (input[i] < pivot) {
                i++;
            }
            while (input[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                // move index to next position on both sides
                i++;
                j--;
            }
        }

        // calls quickSort() method recursively
        if (low < j) {
            quickSort(low, j);
        }

        if (i < high) {
            quickSort(i, high);
        }
    }

    private void swap(int i, int j) {
        long temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}