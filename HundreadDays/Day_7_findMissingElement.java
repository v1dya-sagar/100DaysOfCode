package HundreadDays;

public class Day_7_findMissingElement {
    public static void main(String[] args) {
        int[] givenArray = {1,2,5,6,3,8,4};
        int n = givenArray.length + 1;
        int sum = 0;
        for (int i = 0; i < givenArray.length; i++) {
            sum += givenArray[i];
        }
        int total = (n*(n+1))/2;
        System.out.println(total - sum);
    }
}
