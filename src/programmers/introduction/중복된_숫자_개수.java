package programmers.introduction;

import java.util.Arrays;

public class 중복된_숫자_개수 {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,5};
        int n = 1;
        long list = Arrays.stream(array).filter(x -> x == n).count();
        int answer = (int) list;


    }
}
