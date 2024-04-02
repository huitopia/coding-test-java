package programmers.introduction;

import java.util.Arrays;

public class 아이스_아메리카노 {
    public static void main(String[] args) {
        // 아이스 아메리카노
        int money = 5500;
        int[] answer = new int[2]; // [0] : 잔, [1] 남는 돈
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        System.out.println("answer = " + Arrays.toString(answer));

    }
}
