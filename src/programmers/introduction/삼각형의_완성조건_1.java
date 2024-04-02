package programmers.introduction;

import java.util.Arrays;
import java.util.OptionalInt;

public class 삼각형의_완성조건_1 {
    public static void main(String[] args) {
        int[] sides = {1,2,3};
        int answer = 1; // success : 1, false : 2
        // 가장 긴 변의 길이가 남은 인덱스의 합보다 작아야함
        Arrays.sort(sides);
        System.out.println("sides = " + Arrays.toString(sides));
        OptionalInt reduce = Arrays.stream(sides)
                .reduce((x, y) -> x+y);
        int sum = reduce.getAsInt() - sides[2];
        System.out.println("sum = " + sum);
        if(sum <= sides[2]) {
            answer =2;
        }
        System.out.println("answer = " + answer);

    }
}
