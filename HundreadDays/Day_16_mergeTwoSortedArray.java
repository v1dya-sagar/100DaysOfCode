package HundreadDays;

import java.util.Arrays;

public class Day_16_mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1,2,4,0,0,0,}, b = {3,5,6};
        int m = 3, n = 3;
        int i = m - 1, j = n -1, k = m + n - 1;
        while(j >= 0){
            if(i >= 0 && a[i] > b[j]){
                a[k] = a[i];
                i--;
                k--;
            } else{
                a[k] = b[j];
                j--;
                k--;
            }
        }
        System.out.println(Arrays.toString(a));

    }
}
