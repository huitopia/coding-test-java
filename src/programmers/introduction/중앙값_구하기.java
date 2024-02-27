package programmers.introduction;

import java.util.Arrays;
public class 중앙값_구하기 {
//    순서대로 정렬 후 배열 가운데 값 구하기
    public static void main(String[] args) {
        int array[] = new int[]{9, -1, 0};
        Arrays.sort(array);
        int center = array.length/2;
    }
}
