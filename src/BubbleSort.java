
import java.util.Arrays;


public class BubbleSort {
    private static final int[] NUMBERS = { 35, 36, 99, 37, 56, 77, 71, 2, 9, 63, 48, 59, 29, 7, 31, 40, 17, 39, 22, 80,
            81, 83, 55, 44, 77 };

    public static void bubbleSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Mảng được cho");
        System.out.println(Arrays.toString(NUMBERS));
        System.out.println(Arrays.toString(array) + " => Bubble Sort");
    }

    public static int[] getNumbers() {
        return NUMBERS;
    }
}
