package programmers.introduction;

import java.util.Arrays;
public class 최댓값_만들기_2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,-3,-4,-5};
        Arrays.sort(numbers);
        int answer = Math.max(
                numbers[0] * numbers[1], numbers[numbers.length-1] * numbers[numbers.length - 2]
        );
        System.out.println("answer = " + answer);
    }
}
