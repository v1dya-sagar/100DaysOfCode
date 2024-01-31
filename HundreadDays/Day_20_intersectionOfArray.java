package HundreadDays;

import java.util.ArrayList;
import java.util.List;

public class Day_20_intersectionOfArray {
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6}, b = {2,3,5,7};
        int i = 0 , j = 0;
        List<Integer> result = new ArrayList<>();
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                i++;
            } else if(b[j] < a[i]) {
                j++;
            } else {
                result.add(a[i]);
                i++;
                j++;
            }
        }
        System.out.println(result);
    }
}
