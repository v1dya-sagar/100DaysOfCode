package HundreadDays;

public class Day_5_largestElementInArray {
    public static void main(String[] args) {
        int[] givenArray = {1,2,5,6,2,8};
        int max = 0;
        for (int j : givenArray) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
