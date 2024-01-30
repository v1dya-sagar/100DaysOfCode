package HundreadDays;

import java.util.ArrayList;
import java.util.List;

public class Day_13_leadersInArray {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
//      List<Integer> result =new ArrayList<>();
        int max = arr[arr.length - 1];
        System.out.println(max);
        for (int i = arr.length - 2 ; i >= 0; i--) {
            if(arr[i] > max){
                max = arr[i];
//              result.add(arr[i]);
                System.out.println(max);
            }
        }

    }
}
