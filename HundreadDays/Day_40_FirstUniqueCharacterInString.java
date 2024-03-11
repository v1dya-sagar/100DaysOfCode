package HundreadDays;

public class Day_40_FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String s = "eletcode";
        int[] charArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charArray[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[s.charAt(i) - 'a'] == 1){
                System.out.println(i);
                break;
            }
        }
    }
}
