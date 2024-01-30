package HundreadDays;

public class Day_1_factorialOfANumber {
    public static void main(String[] args) {
        int number = 10, res = 1;
        for(int i = 2; i < number; i++){
            res *= i;
        }
        System.out.println(res);
    }

}
