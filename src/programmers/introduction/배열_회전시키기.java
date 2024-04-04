package programmers.introduction;

import java.util.Arrays;

public class 배열_회전시키기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        String direction = "left";
        // right : i + 1, 맨 끝은 arr[0]
        // left : i - 1, 맨 앞은 arr[arr.length]
        int[] answer = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if(direction.equals("right")) {
                if(i == numbers.length - 1) {
                    answer[0] = numbers[i];
                } else {
                    answer[i+1] = numbers[i];
                }
            } else {
                if(i == 0) {
                    answer[numbers.length-1] = numbers[0];
                } else {
                    answer[i-1] = numbers[i];
                }
            }
        }
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
