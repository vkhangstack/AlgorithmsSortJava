import java.util.Arrays;

public class ShellSort {
    public static void shellSort(int [] array){
        int  i;
        int j;
        int temp;
        int gap = 1;
        int len = array.length;
        while (gap < len / 3) {
            gap = gap * 3 +1; 
        }
        for(; gap > 0; gap /= 3) {
            for(i = gap; i < len; i++) {
                temp = array[i];
                for(j = i - gap; j >= 0 && array[j] > temp; j-= gap) {
                    array[j + gap] = array[j]; 
                }
                array[j + gap] = temp;
            }
        }
        System.out.println(Arrays.toString(array) + " => ShellSort");
    }
}
