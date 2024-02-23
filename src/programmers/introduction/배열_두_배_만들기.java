package programmers.introduction;

import java.util.Arrays;

public class 배열_두_배_만들기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,100,-99,1,2,3} ;
        int[] answer = numbers;
        for(int i = 0; i < numbers.length; i ++) {
            answer[i] = numbers[i]*2;
        }
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
