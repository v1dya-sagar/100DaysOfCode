package HundreadDays;

import java.util.Arrays;

public class Day_9_rightRotate {
    public static void main(String[] args) {
        int[] givenArray = {1,2,3,4,5};
        int k = 3;
        //output = {3,4,5,1,2
        // }
        reverseArray(givenArray,0,givenArray.length - 1);
        reverseArray(givenArray,0,k-1);
        reverseArray(givenArray,k,givenArray.length - 1);

        System.out.println(Arrays.toString(givenArray));

    }

    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards each other
            start++;
            end--;
        }
    }
}
