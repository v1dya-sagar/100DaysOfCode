package HundreadDays;

public class Day_11_secondLargestElement {
    public static void main(String[] args) {
        int[] givenArray = {1,2,3,4,5,5,6,6};
        int first = givenArray[0], second = 0;

        for (int i = 0; i < givenArray.length; i++) {
            if(givenArray[i] > first){
                second = first;
                first = givenArray[i];
            } else if (givenArray[i] > second && givenArray[i] != first) {
                second = givenArray[i];
            }
        }
        System.out.println(second);
    }
}
