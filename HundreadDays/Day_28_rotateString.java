package HundreadDays;

public class Day_28_rotateString {
    public static void main(String[] args) {
        String s1 = "abcdef", s2 = "cdefab";
        if(s1.length() != s2.length()){
            System.out.println("False");
        } else{
            String a = s1 + s1;
            int index = a.indexOf(s2);
            System.out.println(index >= 0 ? "True" : "False");
        }

    }
}
