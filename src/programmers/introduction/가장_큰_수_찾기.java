package programmers.introduction;

import java.util.Arrays;

public class 가장_큰_수_찾기 {
    public static void main(String[] args) {
        int[] array = {1,8,3};
        int[] answer = new int[2]; // 8,1
        // 가장 큰 수와 그 수의 인덱스를 담은 배열
        answer[0] = Arrays.stream(array)
                .max()
                .getAsInt();
        answer[1] =Arrays.binarySearch(array,answer[0]);
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
