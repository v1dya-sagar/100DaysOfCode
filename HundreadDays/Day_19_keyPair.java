package HundreadDays;

import java.util.HashSet;

public class Day_19_keyPair {
    public static void main(String[] args) {
        int x = 16;
        boolean flag = false;
        int[] a = {1,4,5,6,10,8};
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            int value = x - a[i];
            if(h.contains(value)){
                flag = true;
                break;
            } else {
                h.add(a[i]);
            }
        }
        System.out.println(flag ? "Pair is available" : "Pair is not available");

    }
}
