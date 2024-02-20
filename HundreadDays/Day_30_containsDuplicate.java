package HundreadDays;

import java.util.Arrays;

public class Day_30_containsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        Arrays.sort(arr);
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                flag = true;
                break;
            }
        }
        //use ternary operator here

        System.out.println(flag ? "Contains Duplicate" : "No Duplicate");

    }
}
