package HundreadDays;

public class Day_22_anagramCheck {
    public static void main(String[] args) {
        String a = "abcd", b = "cdba";
        int[] freq = new int[26];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }
        boolean flag = true;
        for(int n : freq){
            if(n != 0){
                flag = false;
            }
        }
        System.out.println(flag ? "anagram" : "not anagram");
    }
}
