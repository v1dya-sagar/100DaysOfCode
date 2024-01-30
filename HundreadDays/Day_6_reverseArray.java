package HundreadDays;

import java.util.Arrays;

public class Day_6_reverseArray {
    public static void main(String[] args) {
        //using extra space is forbidden.
        int[] givenArray = {1,2,5,6,2,8};
        int i = 0 , j = givenArray.length - 1;
        while(i < j){
            int temp = givenArray[j];
            givenArray[j] = givenArray[i];
            givenArray[i] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(givenArray));
    }
}
