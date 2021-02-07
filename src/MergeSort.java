import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array) {
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array) + "=> MergeSort");
    }

    private static void sort(int[] data, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            sort(data, left, center);
            sort(data, center + 1, right);
            merge(data, left, center, right);
        }
    }

    private static void merge(int[] data, int left, int center, int right) {
        int[] tmpArr = new int[data.length];
        int mid = center + 1;
        int third = left;
        int tmp = left + right;
        while (left <= center && mid <= right) {
            if (data[left] <= data[mid]) {
                tmpArr[third++] = data[left++];
            } else {
                tmpArr[third++] = data[mid++];
            }
        }
        while (mid <= right) {
            tmpArr[third++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[third++] = data[mid++];
        }
        while (tmp <= right) {
            data[tmp] = tmpArr[tmp++];
        }
    }
}
