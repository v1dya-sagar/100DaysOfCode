package HundreadDays;

public class Day_32_maxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0};
        int count = 0, max = 0;
        for(int e : arr){
            if(e != 1){
                if(count > max ){
                    max = count;
                    count =0;
                }
            } else{
                count++;
            }
        }
        System.out.println(max);
    }
}
