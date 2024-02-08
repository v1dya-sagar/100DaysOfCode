package HundreadDays;

public class Day_36_armstrongNumber {
    public static void main(String[] args) {
        int n = 1634, sum = 0;
        int original = n;
        int len = String.valueOf(n).length();
        while (n > 0){
            sum += (int) Math.pow(n%10, len);
            n /= 10;
        }
        System.out.println(sum == original ? "True" : "false");
    }
}
