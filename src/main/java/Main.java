import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random(10);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.SortBubble(arr)));
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.SorterSelection(arr)));
        InsertSort insertSort = new InsertSort();
        System.out.println(Arrays.toString(insertSort.SorterIncert(arr)));
    }
}
