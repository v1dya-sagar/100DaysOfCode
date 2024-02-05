package HundreadDays;

public class Day_24_reverseNumberPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for(int j = n - i + 1; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
