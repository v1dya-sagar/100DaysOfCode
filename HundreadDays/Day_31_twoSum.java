package HundreadDays;

import java.util.*;
import java.util.Arrays;
import java.util.HashMap;

public class Day_31_twoSum {
    public static void main(String[] args) {
        int[] arr = {11,15,2,7};
        int value = 9;
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int complement = value - arr[i];
            if(hm.containsKey(complement)){
                result.add(hm.get(complement));
                result.add(i);
            }else {
                hm.put(arr[i], i);
            }
        }
        System.out.println(Arrays.toString(result.toArray()));
    }
}
