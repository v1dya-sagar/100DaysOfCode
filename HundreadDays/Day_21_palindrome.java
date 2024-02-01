package HundreadDays;

public class Day_21_palindrome {
    public static void main(String[] args) {
        String s = "madam";
        StringBuilder ns = new StringBuilder(s);
        System.out.println(s.contentEquals(ns) ? "palindrome" : "not palindrome");
    }
}
