import java.util.Arrays;

class Main {

    private static final int[] NUMBERS = { 35, 36, 99, 37, 56, 77, 71, 2, 9, 63, 48, 59, 29, 7, 31, 40, 17, 39, 22, 80,
            81, 83, 55, 44, 77, 11 };

    public static void main(String[] args) {
        System.out.println("Mảng được cho");
        System.out.println(Arrays.toString(NUMBERS));
        System.out.println("----------------------------------------------------------------");

        BubbleSort.bubbleSort(NUMBERS);// type bubbleSort
        System.out.println("----------------------------------------------------------------");
        SelectSort.selectSort(NUMBERS); // type selectSort
        System.out.println("----------------------------------------------------------------");
        InsertSort.insertSort(NUMBERS); // type insertSort
        System.out.println("----------------------------------------------------------------");
        ShellSort.shellSort(NUMBERS); // type shellSort
        System.out.println("----------------------------------------------------------------");
        QuickSort.quickSort(NUMBERS); // type quickSort
        System.out.println("----------------------------------------------------------------");
        HeapSort.heapSort(NUMBERS);
    }
}
