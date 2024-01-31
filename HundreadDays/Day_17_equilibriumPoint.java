package HundreadDays;

public class Day_17_equilibriumPoint {
    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
        int rightSum = 0 , leftSum = 0;
        for (int i = 0; i < a.length; i++) {
            rightSum += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            rightSum -= a[i];
            if(leftSum == rightSum){
                System.out.println(a[i]);
                break;
            }
            leftSum += a[i];
        }
    }


}
