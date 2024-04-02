package programmers.introduction;

import java.util.Arrays;

public class 머쓱이보다_키_큰_사람 {
    public static void main(String[] args) {
        int[] array = {149,180,192,170};
        int height = 167;
        Arrays.stream(array).filter(x -> x > height).count();
    }
}
