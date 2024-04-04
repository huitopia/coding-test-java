package programmers.introduction;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자_정렬하기_2 {
    public static void main(String[] args) {
        String my_string = "Bcad";
        String answer = my_string.chars().mapToObj(Character::toLowerCase)
                .map(x -> Character.toString(x))
                .sorted()
                .collect(Collectors.joining());
        System.out.println("answer = " + answer);
    }
}
