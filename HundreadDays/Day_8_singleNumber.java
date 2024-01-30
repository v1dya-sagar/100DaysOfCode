package HundreadDays;

public class Day_8_singleNumber {
    public static void main(String[] args) {
        int[] givenArray = {1,1,2,5,6,2,5};
        int res = 0;
        for (int element : givenArray) {
            res ^= element;
        }
        System.out.println(res);
    }
}
