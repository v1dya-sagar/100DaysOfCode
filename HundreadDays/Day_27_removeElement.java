package HundreadDays;

import java.util.Arrays;

public class Day_27_removeElement {
    public static void main(String[] args) {
        int[] a = {3,2,2,3};
        int c = 0, val = 3;
        for (int i = 0; i < a.length; i++) {
            if(a[i] != val){
                a[c] = a[i];
                c++;
            }
        }
        System.out.println(c);
    }
}
