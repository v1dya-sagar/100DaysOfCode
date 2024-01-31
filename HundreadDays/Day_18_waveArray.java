package HundreadDays;

import java.util.Arrays;

public class Day_18_waveArray {
    public static void main(String[] args) {
        int[] a = {2,4,7,8,9,10};
        int i = 0, j = 1;
        while (i < a.length && j < a.length){
            swap(a,i,j);
            i += 2;
            j += 2;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
