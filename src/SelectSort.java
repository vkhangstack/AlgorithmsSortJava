import java.util.Arrays;

public class SelectSort {
    private static final int[] NUMBERS = { 35, 36, 99, 37, 56, 77, 71, 2, 9, 63, 48, 59, 29, 7, 31, 40, 17, 39, 22, 80,
            81, 83, 55, 44, 77 };
   

    public static int[] getNumbers() {
        return NUMBERS;
    }
    public static void selectSort(int[] array) {
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            int j = i + 1;
            position = i;
            int temp = array[i];
            for (; j < array.length; j++) {
                if (array[j] < temp) {
                    temp = array[j];
                    position = j;
                }
            }
            array[position] = array[i];
            array[i] = temp;
        }
        System.out.println("Mảng được cho");
        System.out.println(Arrays.toString(NUMBERS));
        System.out.println(Arrays.toString(array) + "=> selectSort");
    }
}
