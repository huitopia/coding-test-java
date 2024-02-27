package programmers.introduction;

import java.util.Arrays;

public class 짝수는_싫어요 {
    public static void main(String[] args) {
//        주어진 정수 이하의 홀수가 오름차순으로 담긴 배열
        int n = 10;
//        n이 홀수인지 짝수인지 배열 길이 정함
        n = (n % 2) == 0 ? n / 2 : (n / 2) + 1;
//        배열 초기화
        int[] array = new int[n];
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            array[i] = cnt;
            cnt = cnt +2;
        }
        System.out.println("array = " + Arrays.toString(array));
    }
}
