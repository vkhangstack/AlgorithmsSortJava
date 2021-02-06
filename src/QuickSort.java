import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] array){
        _quickSort(array, 0, array.length -1);
        System.out.println(Arrays.toString(array)+ " => quickSort");
    }
    private static int getMiddle(int[] list, int low, int high){
        int tmp = list[low];
        while( low < high){
            while(low < high && list[high] >= tmp){
                high--;
             }

             list[low] = list[high];
             while(low < high && list[low] <= tmp){
                 low++;
             }
             list[high] = list[low];
        }
        list[low] = tmp;
        return low;

    }

    private static void _quickSort(int[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high);
            _quickSort(list, low, middle - 1);
            _quickSort(list, middle + 1, high);
        }
    }
}
