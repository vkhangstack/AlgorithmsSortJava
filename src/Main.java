class Main{

    private static final int[] NUMBERS = { 35, 36, 99, 37, 56, 77, 71, 2, 9, 63, 48, 59, 29, 7, 31, 40, 17, 39, 22, 80,
        81, 83, 55, 44, 77 };

    public static void main(String[] args) {
        BubbleSort.bubbleSort(NUMBERS);// type bubbleSort
        SelectSort.selectSort(NUMBERS); // type selectSort
    }
}
