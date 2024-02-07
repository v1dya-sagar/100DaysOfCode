package HundreadDays;

import java.util.Arrays;

public class Day_35_rearrangeElementsBySign {
    public static void main(String[] args) {
        int[] arr = {3, 1, -2, -5, 2, -4};
        int[] answer = new int[arr.length];
        int j = 1, k = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                answer[k] = arr[i];
                k += 2;
            } else {
                answer[j] = arr[i];
                j += 2;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
