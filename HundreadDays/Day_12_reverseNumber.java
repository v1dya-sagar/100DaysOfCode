package HundreadDays;

public class Day_12_reverseNumber {
    public static void main(String[] args) {
        int n = 12345, reversedNumber = 0;
        while (n > 0){
            reversedNumber = reversedNumber* 10 + n%10;
            n /= 10;
        }
        System.out.println(reversedNumber);
    }

    //Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
}
