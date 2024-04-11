package programmers.introduction;

import java.util.Arrays;

public class 숨어있는_숫자의_덧셈_2 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        int answer = 0; // 37
        // 숨어있는 숫자 찾아서 합하기
//        int num = Stream.of(my_string.replaceAll("[a-zA-Z]", "")
//                        .split(""))
//                .mapToInt(Integer::parseInt)
//                .sum();

        int sum = Arrays.stream(my_string.split("[a-zA-Z]"))
                .filter(x -> !x.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println("sum = " + sum);
    }
}
