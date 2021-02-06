import java.util.Arrays;

public class HeapSort {

    public static void heapSort(int[] array) {

        int len = array.length - 1;
        int beginIndex = (len - 1) >> 1;
        for (int i = beginIndex; i >= 0; i--) {
            maxHeapify(i, len, array);
        }

        for (int i = len; i > 0; i--) {
            swap(0, i, array);
            maxHeapify(0, i - 1, array);
        }
        System.out.println(Arrays.toString(array) + " => HeapSort");
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void maxHeapify(int index, int len, int[] arr) {
        int li = (index << 1) + 1;
        int ri = li + 1;
        int cMax = li;
        if (li > len) {
            return;
        }
        if (ri <= len && arr[ri] > arr[li]) {
            cMax = ri;
        }
        if (arr[cMax] > arr[index]) {
            swap(cMax, index, arr);
            maxHeapify(cMax, len, arr);
        }

    }
}
