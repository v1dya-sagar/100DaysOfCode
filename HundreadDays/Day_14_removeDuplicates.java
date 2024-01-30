package HundreadDays;

public class Day_14_removeDuplicates {
    public static void main(String[] args) {
        int[] a = {1,2,2,7};
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > a[j]){
                j++;
                a[j] = a[i];
            }
        }
        System.out.println(
                j+1
        );
    }
}
